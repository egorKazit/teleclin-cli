package org.telclin.scenario.particular;

import lombok.NonNull;
import lombok.SneakyThrows;
import lombok.experimental.SuperBuilder;
import org.jetbrains.annotations.NotNull;
import org.telclin.function.SetChatsLoaded;
import org.telclin.scenario.TelegramScenarioException;
import org.telclin.tdlib.TdApi;

@SuperBuilder
public class TelegramScenarioLoadChats extends TelegramScenarioAbstract<TdApi.Object> {

    private boolean isLoaded = false;

    @SneakyThrows
    @Override
    public TdApi.Function<? extends TdApi.Object> getNextRegularFunction(TdApi.Object object) {
        // if not fully loaded, then load more
        if (!isLoaded) {
            return getFirstStepFunction(args.length > 0 ? args[0] : "50");
        } else {
            // if loaded, then set final object
            return new SetChatsLoaded();
        }

    }

    @Override
    public TdApi.@NonNull Function<? extends TdApi.Object> getFirstStepFunction(String @NotNull ... args) throws TelegramScenarioException {
        if (args.length > 1)
            throw new TelegramScenarioException();
        try {
            int size = args.length == 1 ? Integer.parseInt(args[0]) : 50;
            return new TdApi.LoadChats(new TdApi.ChatListMain(), size);
        } catch (NumberFormatException numberFormatException) {
            throw new TelegramScenarioException(numberFormatException);
        }
    }

    @Override
    public TdApi.@NonNull Object getLastStepObject() {
        return new SetChatsLoaded();
    }

    @Override
    public boolean handleError(TdApi.@NotNull Error error) throws TelegramScenarioException {
//        if (error.code == 404) {
//            isLoaded = true;
//            getFunctionAndAccept(false, new SetChatsLoaded());
//        } else {
//            super.reactOnError(error);
//        }
        return false;
    }
}
