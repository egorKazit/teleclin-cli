package org.teleclin.client;


import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.jetbrains.annotations.NotNull;
import org.teleclin.scenario.TelegramScenarioException;
import org.teleclin.tdlib.TdApi;

/**
 * Telegram aClient processor.
 * It processes the messages from the attached queue.
 * The idea is to have only one processor per client.
 * The processor itself inherited from the Thread class and should be started separately to reduce processing time
 */
@Log4j2
final class TelegramClientProcessor extends Thread {

    boolean isRunning = true;
    private final Queue<Event> eventQueue = new LinkedBlockingQueue<>();

    private final TelegramClientService telegramClientService;

    /**
     * Main constructor.
     * The according service should be provided
     *
     * @param telegramClientService telegram client service
     */
    TelegramClientProcessor(TelegramClientService telegramClientService) {
        this.telegramClientService = telegramClientService;
    }

    @Override
    public void run() {
        while (isRunning) {
            // poll event from the queue and process if not null
            Event event = eventQueue.poll();
            if (event == null) {
                continue;
            }
            // check if the event to close the connection
            boolean closeConnectionFlag = needsToClose(event);
            log.atTrace().log("Event id {} is going to be processed", event.eventId);

            // process the event according to the current client scenario if scenario is set
            if (telegramClientService.getTelegramScenarioDriver() != null) {
                try {
                    telegramClientService.getTelegramScenarioDriver().processStep(event.eventId, event.tdApiObject);
                } catch (TelegramScenarioException telegramScenarioException) {
                    log.atInfo().log("Error on step processing: {}", telegramScenarioException.getMessage());
                }
            } else {
                log.atInfo().log("Event id {} is not processed die to scenario is empty in the service", event.eventId);
            }

            // if event is for closing the connection, then remove from the map of client
            if (closeConnectionFlag) {
                TelegramClientService.removeTelegramClientServiceById(telegramClientService.getTelegramClientId());
            }
        }

    }

    /**
     * Method to add event to the event queue
     *
     * @param event event
     */
    void addEvent(Event event) {
        eventQueue.add(event);
    }

    /**
     * Method to check if event for connection closing
     *
     * @param event event
     * @return true if the connection should be closed
     */
    private boolean needsToClose(@NotNull Event event) {
        if (event.eventId == 0L && event.tdApiObject instanceof TdApi.UpdateAuthorizationState) {
            TdApi.AuthorizationState authorizationState = ((TdApi.UpdateAuthorizationState) event.tdApiObject).authorizationState;
            return authorizationState instanceof TdApi.AuthorizationStateClosed;
        }
        return false;
    }

    /**
     * Event metadata class
     */
    @AllArgsConstructor(access = AccessLevel.PACKAGE)
    static class Event {
        private final long eventId;
        private final TdApi.Object tdApiObject;
    }

}
