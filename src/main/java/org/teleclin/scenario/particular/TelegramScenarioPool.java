package org.teleclin.scenario.particular;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.teleclin.function.SetLoggedIn;
import org.teleclin.tdlib.TdApi;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class TelegramScenarioPool<T extends TdApi.Object> {
    public static final TelegramScenarioPool<SetLoggedIn> LOG_IN = new TelegramScenarioPool<>(SetLoggedIn.class);
    public static final TelegramScenarioPool<SetLoggedIn> LOG_OUT = new TelegramScenarioPool<>(SetLoggedIn.class);
    public static final TelegramScenarioPool<TdApi.Chat> FIND_CHAT = new TelegramScenarioPool<>(TdApi.Chat.class);
    public static final TelegramScenarioPool<TdApi.User> FIND_ME = new TelegramScenarioPool<>(TdApi.User.class);
    public static final TelegramScenarioPool<TdApi.Object> LOAD_CHATS = new TelegramScenarioPool<>(TdApi.Object.class);
    public static final TelegramScenarioPool<TdApi.Object> DELETE_CHAT = new TelegramScenarioPool<>(TdApi.Object.class);
    public static final TelegramScenarioPool<TdApi.Messages> LOAD_MESSAGES = new TelegramScenarioPool<>(TdApi.Messages.class);
    public static final TelegramScenarioPool<TdApi.Message> SEND_MESSAGE_TEXT = new TelegramScenarioPool<>(TdApi.Message.class);
    public static final TelegramScenarioPool<TdApi.Message> SEND_MESSAGE_PHOTO = new TelegramScenarioPool<>(TdApi.Message.class);
    public static final TelegramScenarioPool<TdApi.Message> SEND_MESSAGE_AUDIO = new TelegramScenarioPool<>(TdApi.Message.class);
    public static final TelegramScenarioPool<TdApi.Message> SEND_MESSAGE_DOCUMENT = new TelegramScenarioPool<>(TdApi.Message.class);
    public static final TelegramScenarioPool<TdApi.Message> CHANGE_MESSAGE_TEXT = new TelegramScenarioPool<>(TdApi.Message.class);
    public static final TelegramScenarioPool<TdApi.Messages> DELETE_MESSAGE_TEXT = new TelegramScenarioPool<>(TdApi.Messages.class);
    public static final TelegramScenarioPool<TdApi.File> DOWNLOAD_FILE = new TelegramScenarioPool<>(TdApi.File.class);

    @Getter
    private final Class<T> type;
}
