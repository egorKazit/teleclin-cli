package org.teleclin.client;

import java.io.File;
import java.nio.file.Path;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Telegram client log info
 */
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class TelegramClientLogInfo {

    private static final ConcurrentMap<String, TelegramClientLogInfo> telegramClientLogInfoHolder = new ConcurrentHashMap<>();

    @NonNull
    final String logFile;
    @Builder.Default
    final int logConsoleLevel = 0;
    @Builder.Default
    final int logFileLevel = 5;

    @Contract(" -> new")
    public static @NotNull TelegramClientLogInfoBuilder builder() {
        return new TelegramClientLogInfoExtendedBuilder();
    }

    public static void addTelegramClientLogInfo(String sessionName, TelegramClientLogInfo telegramClientLogInfo) {
        telegramClientLogInfoHolder.put(sessionName, telegramClientLogInfo);
    }

    public static TelegramClientLogInfo getTelegramClientLogInfo(String sessionName) {
        return telegramClientLogInfoHolder.computeIfAbsent(sessionName, s ->
                TelegramClientLogInfo.builder()
                        .logFile(new File(TelegramClientService.getWorkingDirectory(), "connection/tdlib-" + sessionName + ".log").getPath()).build()
        );
    }

    public static class TelegramClientLogInfoExtendedBuilder extends TelegramClientLogInfoBuilder {

        public TelegramClientLogInfo build() {
            var logInfo = super.build();
            var parentFolder = Path.of(logInfo.logFile).getParent().toFile();
            if (!parentFolder.exists()) parentFolder.mkdirs();
            return logInfo;
        }
    }
}
