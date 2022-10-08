package org.telclin.client;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;

/**
 * Telegram client log info
 */
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class TelegramClientLogInfo {

    @NonNull
    final String logFile;
    @Builder.Default
    final int logConsoleLevel = 0;
    @Builder.Default
    final int logFileLevel = 5;
}
