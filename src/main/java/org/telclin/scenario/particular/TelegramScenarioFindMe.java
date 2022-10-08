package org.telclin.scenario.particular;

import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import org.jetbrains.annotations.NotNull;
import org.telclin.function.SetIFound;
import org.telclin.scenario.TelegramScenarioException;
import org.telclin.tdlib.TdApi;

@SuperBuilder
public class TelegramScenarioFindMe extends TelegramScenarioAbstract<TdApi.User> {


    @Override
    public TdApi.Function<? extends TdApi.Object> getNextRegularFunction(TdApi.@NotNull Object object) {
        if (object.getConstructor() == TdApi.User.CONSTRUCTOR) {
            return new SetIFound();
        }
        return null;
    }

    @Override
    public TdApi.@NonNull Function<? extends TdApi.Object> getFirstStepFunction(String... args) throws TelegramScenarioException {
        return new TdApi.GetMe();
    }

    @Override
    public TdApi.@NonNull Object getLastStepObject() {
        return new SetIFound();
    }
}
