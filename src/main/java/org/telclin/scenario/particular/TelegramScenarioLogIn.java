package org.telclin.scenario.particular;

import static org.telclin.client.TelegramClientConsoleInteraction.readLine;
import static org.telclin.client.TelegramClientConsoleInteraction.readPassword;

import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import lombok.extern.log4j.Log4j2;
import org.telclin.function.SetLoggedIn;
import org.telclin.tdlib.TdApi;

@SuperBuilder
@Log4j2
class TelegramScenarioLogIn extends TelegramScenarioAbstract<SetLoggedIn> {


    private String phoneNumber;

    private char[] authenticationCode;

    private char[] password;

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
                return new TdApi.CheckAuthenticationCode(authenticationCode != null ? String.valueOf(authenticationCode) : readLine("Please enter authentication code: "));
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
        if (args.length > 0 && args[0] != null)
            phoneNumber = args[0];
        if (args.length > 1 && args[1] != null)
            authenticationCode = args[1].toCharArray();
        if (args.length > 2 && args[2] != null)
            password = args[2].toCharArray();
        return new TdApi.GetOption("version");
    }

    @Override
    public @NonNull TdApi.Object getLastStepObject() {
        return new SetLoggedIn();
    }

}
