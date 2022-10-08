package org.telclin.client;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.jetbrains.annotations.NotNull;
import org.telclin.tdlib.Client;
import org.telclin.tdlib.TdApi;

/**
 * Main class to perform the communication with native client.
 * The native client is present in attribute nativeClient
 */
@Log4j2
final class TelegramClient {

    @Getter(AccessLevel.PACKAGE)
    private final int apiId;
    @Getter(AccessLevel.PACKAGE)
    private final String apiHash;

    private final Client nativeClient = Client.create();

    @Getter
    private final TelegramClientService telegramClientService;

    /**
     * Lite constructor without log info.
     * The default log info is used
     *
     * @param telegramClientService telegram client service
     * @param apiId                 api id
     * @param apiHash               api hash
     */
    TelegramClient(TelegramClientService telegramClientService, String sessionName, int apiId, String apiHash) {
        this(telegramClientService, apiId, apiHash, TelegramClientLogInfo.builder()
                .logFile(new File(TelegramClientService.getWorkingDirectory(), "connection/tdlib-" + sessionName + ".log").getPath()).build());
    }

    /**
     * All arguments constructor
     *
     * @param telegramClientService telegram client service
     * @param apiId                 api id
     * @param apiHash               api hash
     * @param telegramClientLogInfo custom telegram client log info
     */
    TelegramClient(TelegramClientService telegramClientService, int apiId, String apiHash, TelegramClientLogInfo telegramClientLogInfo) {
        this.telegramClientService = telegramClientService;
        this.apiId = apiId;
        this.apiHash = apiHash;
        setLogLevel(telegramClientLogInfo);
        log.atInfo().log("Telegram Client with id {} and configuration {} has been started", apiId, telegramClientLogInfo);
    }

    /**
     * Method to get native id client id.
     * As underlying native client is private, the method conducts native client id
     *
     * @return native id client id
     */
    int getNativeClientId() {
        return nativeClient.getNativeClientId();
    }

    /**
     * The main method to send data via native client
     *
     * @param currentQueueId query id
     * @param function       function that is going to be sent
     */
    void send(long currentQueueId, TdApi.Function<?> function) {
        nativeClient.send(currentQueueId, function);
        log.atInfo().log("A message {} was sent with id {}", function, currentQueueId);
    }

    /**
     * Method to set log info
     *
     * @param telegramClientLogInfo telegram client log info
     */
    private void setLogLevel(@NotNull TelegramClientLogInfo telegramClientLogInfo) {
        nativeClient.setLogMessageHandler(telegramClientLogInfo.logConsoleLevel, new TelegramClientLogMessageHandler());
        log.atInfo().log("Console log level {} was set fot id {}", telegramClientLogInfo.logFileLevel, apiId);
        nativeClient.execute(new TdApi.SetLogVerbosityLevel(telegramClientLogInfo.logFileLevel));
        log.atInfo().log("File log level {} was set fot id {}", telegramClientLogInfo.logFileLevel, apiId);
        var tdApiLogStreamFile = new TdApi.LogStreamFile(telegramClientLogInfo.logFile, 134217728L, false);
        log.atInfo().log("File log path {} was set fot id {}", telegramClientLogInfo.logFile, apiId);
        var tdApiSetLogStream = new TdApi.SetLogStream(tdApiLogStreamFile);
        if (nativeClient.execute(tdApiSetLogStream) instanceof TdApi.Error) {
            throw new IOError(new IOException("Write access to the current directory is required"));
        }
    }

}
