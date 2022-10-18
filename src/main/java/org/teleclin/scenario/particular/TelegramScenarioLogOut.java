package org.teleclin.scenario.particular;

import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import lombok.extern.log4j.Log4j2;
import org.teleclin.function.SetLoggedOut;
import org.teleclin.tdlib.TdApi;

@SuperBuilder
@Log4j2
class TelegramScenarioLogOut extends TelegramScenarioAbstract<SetLoggedOut> {

    @Override
    public TdApi.Function<? extends TdApi.Object> getNextRegularFunction(TdApi.Object object) {
        return null;
    }

    @Override
    public TdApi.Function<? extends TdApi.Object> getNextUpdateFunction(TdApi.Object object) {
        if (!(object instanceof TdApi.UpdateAuthorizationState)) {
            return null;
        }
        TdApi.Object updateObject = ((TdApi.UpdateAuthorizationState) object).authorizationState;
        switch (updateObject.getConstructor()) {
            case TdApi.AuthorizationStateReady.CONSTRUCTOR:
                return new TdApi.LogOut();
            case TdApi.AuthorizationStateLoggingOut.CONSTRUCTOR:
                return null;
            case TdApi.AuthorizationStateClosed.CONSTRUCTOR:
                return new SetLoggedOut();
            default:
                log.atError().log("Unsupported authorization state:\n" + object);
                return null;
        }
    }

    @Override
    public @NonNull TdApi.Function<? extends TdApi.Object> getFirstStepFunction(String... args) {
        return new TdApi.LogOut();
    }

    @Override
    public @NonNull TdApi.Object getLastStepObject() {
        return new SetLoggedOut();
    }
}
