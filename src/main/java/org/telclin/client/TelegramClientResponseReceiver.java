package org.telclin.client;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.telclin.tdlib.Client;
import org.telclin.tdlib.TdApi;

/**
 * General receiver to retrieve the message and process them further.
 * The class is used as separate thread
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
final class TelegramClientResponseReceiver implements Runnable {

    private static final TelegramClientResponseReceiver RESPONSE_RECEIVER = new TelegramClientResponseReceiver();

    static boolean isRunning;
    private static final int MAX_EVENTS = 1000;

    static {
        // in the static section the main thread is started
        Thread telegramClientResponseReceiverThread = new Thread(RESPONSE_RECEIVER, "TdLib Receiver");
        telegramClientResponseReceiverThread.setDaemon(true);
        telegramClientResponseReceiverThread.start();
    }

    @Override
    public void run() {
        while (isRunning) {
            // prepare placeholders for event data
            int[] clientIds = new int[MAX_EVENTS];
            long[] eventIds = new long[MAX_EVENTS];
            TdApi.Object[] events = new TdApi.Object[MAX_EVENTS];

            // receive the events
            int eventCount = Client.receive(clientIds, eventIds, events, 100000.0);

            // distribute them between service processors accordingly
            for (int index = 0; index < eventCount; ++index) {
                processResult(clientIds[index], eventIds[index], events[index]);
                events[index] = null;
            }
        }
    }

    /**
     * Method to process a single event
     *
     * @param clientId client id
     * @param eventId  event id
     * @param event    event
     */
    private void processResult(int clientId, long eventId, TdApi.Object event) {
        // get client if and add to the queue if client is not null
        TelegramClientService telegramClientService = TelegramClientService.getTelegramClientServiceById(clientId);
        if (telegramClientService != null) {
            telegramClientService.getTelegramClientProcessor().addEvent(new TelegramClientProcessor.Event(eventId, event));
        }
    }
}
