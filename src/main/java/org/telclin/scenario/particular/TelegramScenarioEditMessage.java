package org.telclin.scenario.particular;

import java.util.function.Supplier;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import org.jetbrains.annotations.NotNull;
import org.telclin.function.SetMessageSent;
import org.telclin.scenario.TelegramScenarioException;
import org.telclin.tdlib.TdApi;

@SuperBuilder
public class TelegramScenarioEditMessage extends TelegramScenarioAbstract<TdApi.Message> {

    protected Supplier<TdApi.InputMessageContent> supplier;

    @Override
    public TdApi.@NonNull Function<? extends TdApi.Object> getFirstStepFunction(String @NotNull ... args) throws TelegramScenarioException {
        if (args.length != 3)
            throw new TelegramScenarioException();
        try {
            long chatId = Long.parseLong(args[0]);
            long messageId = Long.parseLong(args[1]);
            return new TdApi.EditMessageText(chatId, messageId, null, supplier.get());
        } catch (NumberFormatException numberFormatException) {
            throw new TelegramScenarioException(numberFormatException);
        }
    }

    @Override
    public TdApi.@NonNull Object getLastStepObject() {
        return new SetMessageSent();
    }

    @Override
    public TdApi.Function<? extends TdApi.Object> getNextRegularFunction(TdApi.@NotNull Object object) {
        if (object.getConstructor() == TdApi.Message.CONSTRUCTOR) {
            return new SetMessageSent();
        }
        return null;
    }

}
