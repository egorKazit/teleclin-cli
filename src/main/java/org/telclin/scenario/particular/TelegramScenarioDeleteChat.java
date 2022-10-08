package org.telclin.scenario.particular;

import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import org.jetbrains.annotations.NotNull;
import org.telclin.function.SetChatFound;
import org.telclin.scenario.TelegramScenarioException;
import org.telclin.tdlib.TdApi;

@SuperBuilder
class TelegramScenarioDeleteChat extends TelegramScenarioAbstract<TdApi.Object> {

    @Override
    public TdApi.@NonNull Function<? extends TdApi.Object> getFirstStepFunction(String @NotNull ... args) throws TelegramScenarioException {
        return new TdApi.DeleteChat(Long.parseLong(args[0]));
    }

    @Override
    public TdApi.@NonNull @NotNull Object getLastStepObject() {
        return new SetChatFound();
    }

    @Override
    public TdApi.Function<? extends TdApi.Object> getNextRegularFunction(TdApi.Object object) {
        return new SetChatFound();
    }

}
