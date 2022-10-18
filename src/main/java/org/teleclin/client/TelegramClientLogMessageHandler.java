package org.teleclin.client;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.teleclin.tdlib.Client;

/**
 * Message handler.
 * Then class acts on error and writes it to the log
 */
@Log4j2
@NoArgsConstructor
final class TelegramClientLogMessageHandler implements Client.LogMessageHandler {
    @Override
    public void onLogMessage(int logLevel, String message) {
        if (logLevel < 2)
            log.atError().log("Error during message loading {}", message);
        else
            log.atTrace().log("Message of processing {}", message);
    }
}
