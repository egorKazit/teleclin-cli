package org.teleclin.scenario.particular;

import static org.teleclin.scenario.particular.TelegramScenarioPool.CHANGE_MESSAGE_TEXT;
import static org.teleclin.scenario.particular.TelegramScenarioPool.DELETE_CHAT;
import static org.teleclin.scenario.particular.TelegramScenarioPool.DELETE_MESSAGE_TEXT;
import static org.teleclin.scenario.particular.TelegramScenarioPool.DOWNLOAD_FILE;
import static org.teleclin.scenario.particular.TelegramScenarioPool.FIND_CHAT;
import static org.teleclin.scenario.particular.TelegramScenarioPool.FIND_ME;
import static org.teleclin.scenario.particular.TelegramScenarioPool.LOAD_CHATS;
import static org.teleclin.scenario.particular.TelegramScenarioPool.LOAD_MESSAGES;
import static org.teleclin.scenario.particular.TelegramScenarioPool.LOG_IN;
import static org.teleclin.scenario.particular.TelegramScenarioPool.LOG_OUT;
import static org.teleclin.scenario.particular.TelegramScenarioPool.SEND_MESSAGE_AUDIO;
import static org.teleclin.scenario.particular.TelegramScenarioPool.SEND_MESSAGE_DOCUMENT;
import static org.teleclin.scenario.particular.TelegramScenarioPool.SEND_MESSAGE_PHOTO;
import static org.teleclin.scenario.particular.TelegramScenarioPool.SEND_MESSAGE_TEXT;
import static org.teleclin.scenario.particular.TelegramScenarioSendMessageSupplier.getSupplier;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.teleclin.tdlib.TdApi;

/**
 * Factory of pre-delivered scenarios
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TelegramScenarioFactory {

    @SuppressWarnings("unchecked")
    public static <T extends TdApi.Object, R extends TelegramScenarioAbstract<T>> @Nullable R getScenarioById(@NotNull TelegramScenarioPool<T> scenario,
                                                                                                              String... args) {
        TelegramScenarioAbstract
                .TelegramScenarioAbstractBuilder<?, ?, ?> clientAbstractScenarioBuilder;
        if (LOG_IN.equals(scenario)) {
            clientAbstractScenarioBuilder = TelegramScenarioLogIn.builder();
        } else if (LOG_OUT.equals(scenario)) {
            clientAbstractScenarioBuilder = TelegramScenarioLogOut.builder();
        } else if (FIND_CHAT.equals(scenario)) {
            clientAbstractScenarioBuilder = TelegramScenarioFindChat.builder();
        } else if (FIND_ME.equals(scenario)) {
            clientAbstractScenarioBuilder = TelegramScenarioFindMe.builder();
        } else if (LOAD_CHATS.equals(scenario)) {
            clientAbstractScenarioBuilder = TelegramScenarioLoadChats.builder();
        } else if (DELETE_CHAT.equals(scenario)) {
            clientAbstractScenarioBuilder = TelegramScenarioDeleteChat.builder();
        } else if (LOAD_MESSAGES.equals(scenario)) {
            clientAbstractScenarioBuilder = TelegramScenarioLoadMessages.builder();
        } else if (SEND_MESSAGE_TEXT.equals(scenario)) {
            clientAbstractScenarioBuilder = TelegramScenarioSendMessage.builder()
                    .supplier(() -> new TdApi.InputMessageText(new TdApi.FormattedText(args[1], null), false, true));
        } else if (SEND_MESSAGE_PHOTO.equals(scenario)) {
            clientAbstractScenarioBuilder = TelegramScenarioSendMessage.builder()
                    .supplier(() -> getSupplier(args[1], SEND_MESSAGE_PHOTO));
        } else if (SEND_MESSAGE_AUDIO.equals(scenario)) {
            clientAbstractScenarioBuilder = TelegramScenarioSendMessage.builder()
                    .supplier(() -> getSupplier(args[1], SEND_MESSAGE_AUDIO));
        } else if (SEND_MESSAGE_DOCUMENT.equals(scenario)) {
            clientAbstractScenarioBuilder = TelegramScenarioSendMessage.builder()
                    .supplier(() -> getSupplier(args[1], SEND_MESSAGE_DOCUMENT));
        } else if (CHANGE_MESSAGE_TEXT.equals(scenario)) {
            clientAbstractScenarioBuilder = TelegramScenarioEditMessage.builder()
                    .supplier(() -> new TdApi.InputMessageText(new TdApi.FormattedText(args[2], null), false, true));
        } else if (DELETE_MESSAGE_TEXT.equals(scenario)) {
            clientAbstractScenarioBuilder = TelegramScenarioDeleteMessages.builder();
        } else if (DOWNLOAD_FILE.equals(scenario)) {
            clientAbstractScenarioBuilder = TelegramScenarioGetFile.builder();
        } else {
            return null;
        }
        return (R) clientAbstractScenarioBuilder.type(scenario.getType()).args(args).build();
    }

}
