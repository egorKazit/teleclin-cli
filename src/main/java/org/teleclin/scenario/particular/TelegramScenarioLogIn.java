package org.teleclin.scenario.particular;

import static org.teleclin.client.TelegramClientConsoleInteraction.readLine;
import static org.teleclin.client.TelegramClientConsoleInteraction.readPassword;

import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import lombok.extern.log4j.Log4j2;
import org.teleclin.function.SetLoggedIn;
import org.teleclin.tdlib.TdApi;

@SuperBuilder
@Log4j2
class TelegramScenarioLogIn extends TelegramScenarioAbstract<SetLoggedIn> {


    private final String phoneNumber;

    private final char[] password;

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
            case TdApi.AuthorizationStateWaitPhoneNumber.CONSTRUCTOR:
                String phoneNumberValue = phoneNumber != null ? phoneNumber : readLine("Please enter phone number: ");
                return new TdApi.SetAuthenticationPhoneNumber(phoneNumberValue, null);
            case TdApi.AuthorizationStateWaitCode.CONSTRUCTOR:
                return new TdApi.CheckAuthenticationCode(readLine("Please enter authentication code: "));
            case TdApi.AuthorizationStateWaitPassword.CONSTRUCTOR:
                char[] passwordValue = password != null ? password : readPassword("Please enter password: ");
                return new TdApi.CheckAuthenticationPassword(String.valueOf(passwordValue));
            case TdApi.AuthorizationStateReady.CONSTRUCTOR:
                return new SetLoggedIn();
            default:
                log.atError().log("Unsupported authorization state:\n" + object);
                return null;
        }
    }

    @Override
    public @NonNull TdApi.Function<? extends TdApi.Object> getFirstStepFunction(String... args) {
        return new TdApi.GetOption("version");
    }

    @Override
    public @NonNull TdApi.Object getLastStepObject() {
        return new SetLoggedIn();
    }

}
