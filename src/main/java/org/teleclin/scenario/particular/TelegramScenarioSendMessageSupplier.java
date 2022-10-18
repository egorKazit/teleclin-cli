package org.teleclin.scenario.particular;

import java.net.MalformedURLException;
import java.net.URL;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.jetbrains.annotations.Nullable;
import org.teleclin.tdlib.TdApi;

@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
final class TelegramScenarioSendMessageSupplier {
    static @Nullable TdApi.InputMessageContent getSupplier(String argument, TelegramScenarioPool<TdApi.Message> scenario) {
        new TdApi.InputMessageText(new TdApi.FormattedText(argument, null), false, true);
        TdApi.InputFile inputFile;
        try {
            new URL(argument);
            inputFile = new TdApi.InputFileRemote(argument);
        } catch (MalformedURLException e) {
            log.atTrace().log("Path {} is not for remote load", argument);
            inputFile = new TdApi.InputFileLocal(argument);
        }
        if (scenario == TelegramScenarioPool.SEND_MESSAGE_PHOTO)
            return new TdApi.InputMessagePhoto(inputFile, null, null, 0, 0, null, 0);
        else if (scenario == TelegramScenarioPool.SEND_MESSAGE_AUDIO) {
            return new TdApi.InputMessageAudio(inputFile, null, 0, null, null, null);
        }
        return null;
    }


}
