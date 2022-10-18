package org.teleclin.scenario.particular;

import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import org.jetbrains.annotations.NotNull;
import org.teleclin.function.SetChatFound;
import org.teleclin.scenario.TelegramScenarioException;
import org.teleclin.tdlib.TdApi;

@SuperBuilder
public class TelegramScenarioFindChat extends TelegramScenarioAbstract<TdApi.Chat> {

    @Override
    public TdApi.Function<? extends TdApi.Object> getNextRegularFunction(TdApi.@NotNull Object object) {
        if (object.getConstructor() == TdApi.Chat.CONSTRUCTOR) {
            return new SetChatFound();
        }
        return null;
    }

    @Override
    public TdApi.@NonNull @NotNull Function<? extends TdApi.Object> getFirstStepFunction(String @NotNull ... args) throws TelegramScenarioException {
        if (args.length != 1) {
            throw new TelegramScenarioException();
        }
        try {
            long chatId = Long.parseLong(args[0]);
            return new TdApi.GetChat(chatId);
        } catch (NumberFormatException numberFormatException) {
            return new TdApi.SearchPublicChat(args[0]);
        }
    }

    @Override
    public TdApi.@NonNull Object getLastStepObject() {
        return new SetChatFound();
    }


    @Override
    public boolean handleError(TdApi.Error error) throws TelegramScenarioException {
        return false;
    }
}
