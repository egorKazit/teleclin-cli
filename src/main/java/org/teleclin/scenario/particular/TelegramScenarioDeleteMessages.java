package org.teleclin.scenario.particular;

import java.util.Arrays;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import org.jetbrains.annotations.NotNull;
import org.teleclin.function.SetMessageSent;
import org.teleclin.scenario.TelegramScenarioException;
import org.teleclin.tdlib.TdApi;

@SuperBuilder
class TelegramScenarioDeleteMessages extends TelegramScenarioAbstract<TdApi.Messages> {

    @Override
    public TdApi.@NonNull Function<? extends TdApi.Object> getFirstStepFunction(String @NotNull ... args) throws TelegramScenarioException {
        long[] messageIdInitial = Arrays.stream(args[1].split("\\|")).mapToLong(Long::parseLong).toArray();
        return new TdApi.DeleteMessages(Long.parseLong(args[0]), messageIdInitial, Boolean.getBoolean(args[2]));
    }

    @Override
    public TdApi.@NonNull Object getLastStepObject() {
        return new SetMessageSent();
    }

    @Override
    public TdApi.Function<? extends TdApi.Object> getNextRegularFunction(TdApi.Object object) {
        return new SetMessageSent();
    }

}
