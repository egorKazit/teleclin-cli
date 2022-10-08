package org.telclin.scenario.particular;

import java.util.function.Supplier;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import org.jetbrains.annotations.NotNull;
import org.telclin.function.SetMessageSent;
import org.telclin.scenario.TelegramScenarioException;
import org.telclin.tdlib.TdApi;

@SuperBuilder
class TelegramScenarioSendMessage extends TelegramScenarioAbstract<TdApi.Message> {

    protected Supplier<TdApi.InputMessageContent> supplier;
    private long chatId;
    private long oldMessageId;

    @Override
    public TdApi.Function<? extends TdApi.Object> getNextRegularFunction(TdApi.@NotNull Object object) {
        if (object.getConstructor() == TdApi.Chat.CONSTRUCTOR) {
            TdApi.Chat chat = (TdApi.Chat) object;
            chatId = chat.id;
            TdApi.InputMessageContent inputMessageContent = supplier.get();
            return new TdApi.SendMessage(chat.id, 0L, 0L, null, null, inputMessageContent);
        } else if (object.getConstructor() == TdApi.Message.CONSTRUCTOR) {
            TdApi.Message message = (TdApi.Message) object;
            if (chatId == message.chatId)
                oldMessageId = message.id;
        }
        return null;
    }

    @Override
    public TdApi.Function<? extends TdApi.Object> getNextUpdateFunction(TdApi.@NotNull Object object) {
        if (object.getConstructor() == TdApi.UpdateMessageSendSucceeded.CONSTRUCTOR) {
            TdApi.UpdateMessageSendSucceeded updateMessageSendSucceeded = (TdApi.UpdateMessageSendSucceeded) object;
            if (updateMessageSendSucceeded.oldMessageId == oldMessageId) {
                result = updateMessageSendSucceeded.message;
                return new SetMessageSent();
            }
        }
        return null;
    }

    @Override
    public @NonNull TdApi.Function<? extends TdApi.Object> getFirstStepFunction(String @NotNull ... args) throws TelegramScenarioException {
        if (args.length != 2) {
            throw new TelegramScenarioException();
        }
        return new TdApi.SearchPublicChat(args[0]);
    }

    @Override
    public @NonNull TdApi.Object getLastStepObject() {
        return new SetMessageSent();
    }
}
