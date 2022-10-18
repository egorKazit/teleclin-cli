package org.teleclin.scenario.particular;

import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import org.jetbrains.annotations.NotNull;
import org.teleclin.function.SetIFound;
import org.teleclin.scenario.TelegramScenarioException;
import org.teleclin.tdlib.TdApi;

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
