package org.teleclin.scenario;

import static org.teleclin.scenario.TelegramScenarioEventDefaultProcessor.processEventInternally;
import static org.teleclin.scenario.TelegramScenarioTdLibParametersProvider.getTdLibParameters;
import static org.teleclin.scenario.particular.TelegramScenarioFactory.getScenarioById;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import lombok.NonNull;
import lombok.extern.log4j.Log4j2;
import org.jetbrains.annotations.NotNull;
import org.teleclin.function.CustomSetTdApiFunction;
import org.teleclin.scenario.particular.TelegramScenarioAbstract;
import org.teleclin.scenario.particular.TelegramScenarioPool;
import org.teleclin.tdlib.TdApi;

/**
 * Scenario driver.
 * The class aims to keep all running scenarios in one place with ability to handle it at runtime.
 * A single scenario can be started by startScenario method.
 * Later a method processStep consumes event id and event object and process it according to update sequence or actual event
 */
@Log4j2
public class TelegramScenarioDriver {

    private static final AtomicLong currentQueryId = new AtomicLong();

    private final String sessionName;
    private final int apiId;
    @NonNull
    private final String apiHash;
    private final Map<Long, TelegramScenarioWrapper> scenarios = Collections.synchronizedMap(new LinkedHashMap<>());
    private final TelegramScenarioLockManager telegramScenarioLockManager;
    private final TelegramScenarioFunctionPool functionPool;

    /**
     * Main constructor
     *
     * @param sessionName  session name
     * @param apiId        api id
     * @param apiHash      api hash
     * @param functionPool function pool to send new functions, update chants, etc.
     */
    public TelegramScenarioDriver(String sessionName, int apiId, @NonNull String apiHash, TelegramScenarioFunctionPool functionPool) {
        this.sessionName = sessionName;
        this.apiId = apiId;
        this.apiHash = apiHash;
        this.functionPool = functionPool;
        this.telegramScenarioLockManager = new TelegramScenarioLockManager();
    }

    /**
     * Method to start specific scenario
     *
     * @param scenario scenario id
     * @param args     arguments of scenario
     * @param <T>      type of scenario returning parameter
     * @return reference to scenario
     * @throws TelegramScenarioException exception on scenario processing
     * @throws InterruptedException      exception on thread locking
     */
    public <T extends TdApi.Object> TelegramScenarioAbstract<T> startScenario(TelegramScenarioPool<T> scenario, String... args)
            throws TelegramScenarioException, InterruptedException {
        return startScenario(scenario, true, null, args);
    }

    /**
     * Method to start specific scenario. The same as method above with opportunity ro provide a hook on finish
     *
     * @param scenario     scenario id
     * @param isDialog     dialog flag
     * @param hookOnFinish hook on finish
     * @param args         arguments of scenario
     * @param <T>          type of scenario returning parameter
     * @return reference to scenario
     * @throws TelegramScenarioException exception on scenario processing
     * @throws InterruptedException      exception on thread locking
     */
    public <T extends TdApi.Object> TelegramScenarioAbstract<T> startScenario(TelegramScenarioPool<T> scenario, boolean isDialog,
                                                                              Consumer<TdApi.Object> hookOnFinish, String... args)
            throws TelegramScenarioException, InterruptedException {
        // get scenario based on input
        TelegramScenarioAbstract<T> newScenario = getScenarioById(scenario, args);
        return startScenario(newScenario, isDialog, hookOnFinish, args);
    }

    /**
     * Method to start specific scenario. The same as method above with opportunity ro provide a hook on finish
     *
     * @param newScenario  new scenario
     * @param isDialog     dialog flag
     * @param hookOnFinish hook on finish
     * @param args         arguments of scenario
     * @param <T>          type of scenario returning parameter
     * @return reference to scenario
     * @throws TelegramScenarioException exception on scenario processing
     * @throws InterruptedException      exception on thread locking
     */
    public <T extends TdApi.Object> TelegramScenarioAbstract<T> startScenario(TelegramScenarioAbstract<T> newScenario, boolean isDialog,
                                                                              Consumer<TdApi.Object> hookOnFinish, String... args)
            throws TelegramScenarioException, InterruptedException {
        if (newScenario == null)
            return null;
        // fetch new scenario id and update scenario map
        long ownCurrentQueryId = currentQueryId.incrementAndGet();
        synchronized (scenarios) {
            scenarios.put(ownCurrentQueryId, new TelegramScenarioWrapper(newScenario, isDialog, hookOnFinish));
        }
        // send the first function of scenario
        functionPool.getSendFunction().accept(ownCurrentQueryId, newScenario.getFirstStepFunction(args));
        // lock the current thread if running in dialog
        if (isDialog) {
            telegramScenarioLockManager.lockForCondition(newScenario.getLastStepObject().getConstructor());
        }
        return newScenario;
    }

    /**
     * Method to process a single step
     *
     * @param eventId     event id
     * @param eventObject event object
     * @throws TelegramScenarioException exception on scenario processing
     */
    public void processStep(long eventId, TdApi.Object eventObject) throws TelegramScenarioException {
        // if eventId is 0, then it's update object
        // handle it in proper branch
        if (eventId == 0) {
            processUpdateEvent(eventObject);
        } else {
            // if not zero, then consider the event as regular
            processRegularEvent(eventId, eventObject);
        }

    }

    /**
     * Method to process the update event
     *
     * @param eventObject event object
     */
    private void processUpdateEvent(TdApi.Object eventObject) {
        // check if it's for TdLibParameter
        // if not TdLib, then try handle the event in frame of running scenario -> could be that there's some specific implementation
        if (!getTdLibParameters(eventObject, sessionName, apiId, apiHash, currentQueryId, functionPool) &&
                !tryToHandleUpdateEvent(eventObject)) {
            // if no specific implementation, then handle it centrally
            processEventInternally(eventObject, functionPool);
        }
    }

    /**
     * Method to process the regular event
     *
     * @param eventId     event id
     * @param eventObject event object
     * @throws TelegramScenarioException exception on scenario processing
     */
    private void processRegularEvent(long eventId, TdApi.Object eventObject) throws TelegramScenarioException {
        // fetch scenario
        TelegramScenarioWrapper associatedTelegramScenarioWrapper = scenarios.remove(eventId);
        // scenario should be defined
        // if not, then log an error
        if (associatedTelegramScenarioWrapper != null) {
            // check if an error and leave the method if so
            if (reactOnError(eventId, eventObject, associatedTelegramScenarioWrapper))
                return;
            // fetch new query id and send the next function
            long newCurrentQueryId = currentQueryId.incrementAndGet();
            reactOnRegularEvent(eventObject, newCurrentQueryId, associatedTelegramScenarioWrapper);
        } else {
            // trace non-update events with id that is different from expected
            log.atTrace().log("Event {} is ignored for object {}", eventId, eventObject);
        }
    }

    /**
     * Method to try to handle the update event
     *
     * @param eventObject event object
     * @return true if updated
     */
    private boolean tryToHandleUpdateEvent(TdApi.Object eventObject) {
        // set initial values for variables that will be used further
        long oldCurrentQueryId = 0;
        AtomicLong newCurrentQueryId = new AtomicLong(0);
        boolean isHandled = false;
        AtomicBoolean isFinished = new AtomicBoolean(false);
        TelegramScenarioWrapper associatedTelegramScenarioWrapper = null;
        // synchronized on scenarios to avoid modification
        synchronized (scenarios) {
            // go through all events and try to get the next function
            // the idea is that all scenarios are order in the proper order
            // that means new incoming event belongs to the earlier scenario if 2 scenario contains handlers for the same event
            for (Map.Entry<Long, TelegramScenarioWrapper> associatedScenarioWrapperEntry : scenarios.entrySet()) {
                // get the next function
                TdApi.Function<? extends TdApi.Object> function = associatedScenarioWrapperEntry.getValue().scenario.getNextUpdateFunction(eventObject);
                if (function != null) {
                    // if the function is provided, then send it, update the variables and leave the loop
                    oldCurrentQueryId = associatedScenarioWrapperEntry.getKey();
                    isHandled = true;
                    associatedTelegramScenarioWrapper = associatedScenarioWrapperEntry.getValue();
                    associatedTelegramScenarioWrapper.scenario.setLastSuccessObject(eventObject);
                    associatedTelegramScenarioWrapper.scenario.setLastFunctionUpdate(true);
                    handleUpdateFunction(associatedScenarioWrapperEntry.getValue(),
                            function,
                            newCurrentQueryId,
                            eventObject,
                            isFinished);
                    associatedTelegramScenarioWrapper.scenario.reset();
                    break;
                }
            }
        }
        // set new state based on vars values
        reactOnUpdateEvent(isHandled, oldCurrentQueryId, isFinished.get(), newCurrentQueryId.get(), associatedTelegramScenarioWrapper);
        return isHandled;
    }

    /**
     * Method to handle an error if so
     *
     * @param eventId                           event id
     * @param eventObject                       event object
     * @param associatedTelegramScenarioWrapper associated wrapper
     * @return true if error
     * @throws TelegramScenarioException exception on scenario processing
     */
    private boolean reactOnError(long eventId, TdApi.@NotNull Object eventObject, TelegramScenarioWrapper associatedTelegramScenarioWrapper) throws TelegramScenarioException {
        // if an error, then log and check if retry is possible
        if (eventObject.getConstructor() == TdApi.Error.CONSTRUCTOR) {
            log.atError().log("Error on function execution: {}", eventObject.toString());
            // unlock and remove scenario if retry is impossible
            if (!associatedTelegramScenarioWrapper.scenario.handleError((TdApi.Error) eventObject)) {
                scenarios.remove(eventId);
                if (associatedTelegramScenarioWrapper.isDialog)
                    telegramScenarioLockManager.setWaitForObjectId(associatedTelegramScenarioWrapper.scenario.getLastStepObject().getConstructor());
            } else {
                // try to retry
                long newEventId = currentQueryId.incrementAndGet();
                functionPool.sendFunction.accept(newEventId, associatedTelegramScenarioWrapper.scenario.getFunctionForLastSuccessObject());
                scenarios.put(newEventId, associatedTelegramScenarioWrapper);
            }
            return true;
        }
        return false;
    }

    /**
     * Method to react on regular event
     *
     * @param eventObject                       event object
     * @param newCurrentQueryId                 new query id
     * @param associatedTelegramScenarioWrapper associated scenario wrapper
     */
    private void reactOnRegularEvent(TdApi.Object eventObject,
                                     long newCurrentQueryId,
                                     @NotNull TelegramScenarioWrapper associatedTelegramScenarioWrapper) {
        // reset retry count
        associatedTelegramScenarioWrapper.scenario.reset();
        // get function
        var function = associatedTelegramScenarioWrapper.scenario.getNextRegularFunction(eventObject);
        // get function and process it
        if (function != null) {
            associatedTelegramScenarioWrapper.scenario.setLastSuccessObject(eventObject);
            associatedTelegramScenarioWrapper.scenario.setLastFunctionUpdate(false);
            // send function if the function is not custom one
            if (!function.getClass().isAnnotationPresent(CustomSetTdApiFunction.class)) {
                // send the function
                functionPool.sendFunction.accept(newCurrentQueryId, function);
            }
            // set result if possible
            if (associatedTelegramScenarioWrapper.scenario.getLastStepObject().getConstructor() == function.getConstructor() &&
                    associatedTelegramScenarioWrapper.scenario.getResult() == null) {
                associatedTelegramScenarioWrapper.scenario.setResult(eventObject);
            }
            if (associatedTelegramScenarioWrapper.isDialog)
                telegramScenarioLockManager.setWaitForObjectId(function.getConstructor());
        }
        // update scenario map
        if (function == null || associatedTelegramScenarioWrapper.scenario.getLastStepObject().getConstructor() != function.getConstructor()) {
            scenarios.put(newCurrentQueryId, associatedTelegramScenarioWrapper);
        }
    }

    /**
     * Method to react on update event
     *
     * @param isHandled                         is handled flag
     * @param oldCurrentQueryId                 old query id
     * @param isFinished                        is finished flag
     * @param newCurrentQueryId                 new query id
     * @param associatedTelegramScenarioWrapper associated scenario wrapper
     */
    private void reactOnUpdateEvent(boolean isHandled,
                                    long oldCurrentQueryId,
                                    boolean isFinished,
                                    long newCurrentQueryId,
                                    TelegramScenarioWrapper associatedTelegramScenarioWrapper) {
        // if handled, then remove the scenario
        if (isHandled) {
            scenarios.remove(oldCurrentQueryId);
            // if not finished, then insert new
            if (!isFinished)
                scenarios.put(newCurrentQueryId, associatedTelegramScenarioWrapper);
        }
    }

    /**
     * Method to handle single event
     *
     * @param associatedScenarioWrapper associated scenario wrapper
     * @param function                  function to handle
     * @param newCurrentQueryId         new query id
     * @param eventObject               event object
     * @param isFinished                is finished flag
     */
    private void handleUpdateFunction(@NotNull TelegramScenarioWrapper associatedScenarioWrapper,
                                      TdApi.@NotNull Function<? extends TdApi.Object> function,
                                      AtomicLong newCurrentQueryId,
                                      TdApi.Object eventObject,
                                      AtomicBoolean isFinished) {
        // if function id is not the same as for finish object, then process function
        if (associatedScenarioWrapper.scenario.getLastStepObject().getConstructor() != function.getConstructor()) {
            newCurrentQueryId.set(currentQueryId.incrementAndGet());
            functionPool.sendFunction.accept(newCurrentQueryId.get(), function);
        } else {
            // otherwise unlock the thread or call the hook and set as finished
            if (associatedScenarioWrapper.isDialog) {
                if (associatedScenarioWrapper.scenario.getResult() == null)
                    associatedScenarioWrapper.scenario.setResult(eventObject);
                telegramScenarioLockManager.setWaitForObjectId(function.getConstructor());
            } else
                associatedScenarioWrapper.hookOnFinish.accept(associatedScenarioWrapper.scenario.getResult());
            isFinished.set(true);
        }
    }


}
