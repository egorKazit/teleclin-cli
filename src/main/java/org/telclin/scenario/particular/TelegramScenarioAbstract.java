package org.telclin.scenario.particular;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import lombok.extern.log4j.Log4j2;
import org.telclin.scenario.TelegramScenarioException;
import org.telclin.tdlib.TdApi;

/**
 * Abstract telegram scenario
 */
@Log4j2
@SuperBuilder
public abstract class TelegramScenarioAbstract<R extends TdApi.Object> {

    @Setter
    @Getter
    private TdApi.Object lastSuccessObject;

    @Setter
    @Getter
    private boolean isLastFunctionUpdate;

    @Builder.Default
    protected int attemptsCount = 0;

    protected R result;

    protected final Class<?> type;

    protected final String[] args;

    public R getResult() {
        if (result == null) return null;
        if (type.isInstance(result)) {
            return result;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public void setResult(TdApi.Object result) {
        if (type.isInstance(result)) {
            this.result = (R) type.cast(result);
        }
    }

    /**
     * Method to get the first step function.
     * The function will be used as the first operation
     *
     * @param args arguments for the function
     * @return TdApi function
     * @throws TelegramScenarioException exception on function definition
     */
    @NonNull
    @SuppressWarnings("all")
    public abstract TdApi.@NonNull Function<? extends TdApi.Object> getFirstStepFunction(String... args) throws TelegramScenarioException;

    /**
     * Method to get expected last step object.
     * The object is needed to unlock the main thread where the scenario is started
     *
     * @return TdApi object
     */
    @NonNull
    public abstract TdApi.Object getLastStepObject();

    /**
     * Method to get the next function of scenario in regular case
     *
     * @param object TdApi object
     * @return TdApi function
     */
    @SuppressWarnings("all")
    public abstract TdApi.Function<? extends TdApi.Object> getNextRegularFunction(TdApi.Object object);

    /**
     * Method to get the next function of scenario in update case
     *
     * @param object TdApi object
     * @return TdApi function
     */
    @SuppressWarnings("all")
    public TdApi.Function<? extends TdApi.Object> getNextUpdateFunction(TdApi.Object object) {
        return null;
    }

    /**
     * Method to react on error.
     * Initially, any error is logged and counter is updated.
     * In case of 3 failed attempt the execution of scenario is stopped
     *
     * @param error error object
     * @return true if attempt count exceeded
     * @throws TelegramScenarioException scenario exception
     */
    @SuppressWarnings("used")
    public boolean handleError(TdApi.Error error) throws TelegramScenarioException {
        attemptsCount++;
        return attemptsCount != 3;
    }

    @SuppressWarnings("all")
    public TdApi.Function<? extends Object> getFunctionForLastSuccessObject() {
        if (lastSuccessObject == null)
            return null;
        if (isLastFunctionUpdate) {
            return getNextUpdateFunction(lastSuccessObject);
        } else {
            return getNextRegularFunction(lastSuccessObject);
        }
    }

    /**
     * Method to reset attempt count.
     * The method should be invoked on success step execution
     */
    public void reset() {
        attemptsCount = 0;
    }

}
