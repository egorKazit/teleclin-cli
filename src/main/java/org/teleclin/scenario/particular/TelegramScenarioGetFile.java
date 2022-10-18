package org.teleclin.scenario.particular;

import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import org.jetbrains.annotations.NotNull;
import org.teleclin.function.SetFileDownloaded;
import org.teleclin.scenario.TelegramScenarioException;
import org.teleclin.tdlib.TdApi;

@SuperBuilder
public class TelegramScenarioGetFile extends TelegramScenarioAbstract<TdApi.File> {

    @Override
    public TdApi.Function<? extends TdApi.Object> getNextRegularFunction(TdApi.@NotNull Object object) {
        if (object.getConstructor() == TdApi.File.CONSTRUCTOR) {
            return new SetFileDownloaded();
        }
        return null;
    }

    @Override
    public TdApi.@NonNull Function<? extends TdApi.Object> getFirstStepFunction(String @NotNull ... args) throws TelegramScenarioException {
        if (args.length < 1)
            throw new TelegramScenarioException();
        try {
            int fileId = Integer.parseInt(args[0]);
            return new TdApi.DownloadFile(fileId, 2, 0, 1000000000, false);
        } catch (NumberFormatException numberFormatException) {
            throw new TelegramScenarioException(numberFormatException);
        }

    }

    @Override
    public TdApi.@NonNull Object getLastStepObject() {
        return new SetFileDownloaded();
    }


}
