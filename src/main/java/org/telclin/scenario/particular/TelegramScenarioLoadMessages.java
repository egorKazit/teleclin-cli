package org.telclin.scenario.particular;

import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import org.jetbrains.annotations.NotNull;
import org.telclin.function.SetChatsLoaded;
import org.telclin.scenario.TelegramScenarioException;
import org.telclin.tdlib.TdApi;

@SuperBuilder
public class TelegramScenarioLoadMessages extends TelegramScenarioAbstract<TdApi.Messages> {
    @Override
    public TdApi.@NonNull Function<? extends TdApi.Object> getFirstStepFunction(String @NotNull ... args) throws TelegramScenarioException {
        return new TdApi.GetChatHistory(Long.parseLong(args[0]), Long.parseLong(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), false);
    }

    @Override
    public TdApi.@NonNull Object getLastStepObject() {
        return new SetChatsLoaded();
    }

    @Override
    public TdApi.Function<? extends TdApi.Object> getNextRegularFunction(TdApi.@NotNull Object object) {
        if (object.getConstructor() == TdApi.Messages.CONSTRUCTOR) {
            return new SetChatsLoaded();
        }
        return null;
    }
}
