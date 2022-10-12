package org.telclin.client;

import static org.telclin.scenario.particular.TelegramScenarioPool.CHANGE_MESSAGE_TEXT;
import static org.telclin.scenario.particular.TelegramScenarioPool.DELETE_CHAT;
import static org.telclin.scenario.particular.TelegramScenarioPool.DELETE_MESSAGE_TEXT;
import static org.telclin.scenario.particular.TelegramScenarioPool.DOWNLOAD_FILE;
import static org.telclin.scenario.particular.TelegramScenarioPool.FIND_CHAT;
import static org.telclin.scenario.particular.TelegramScenarioPool.FIND_ME;
import static org.telclin.scenario.particular.TelegramScenarioPool.LOAD_CHATS;
import static org.telclin.scenario.particular.TelegramScenarioPool.LOAD_MESSAGES;
import static org.telclin.scenario.particular.TelegramScenarioPool.LOG_IN;
import static org.telclin.scenario.particular.TelegramScenarioPool.LOG_OUT;
import static org.telclin.scenario.particular.TelegramScenarioPool.SEND_MESSAGE_AUDIO;
import static org.telclin.scenario.particular.TelegramScenarioPool.SEND_MESSAGE_PHOTO;
import static org.telclin.scenario.particular.TelegramScenarioPool.SEND_MESSAGE_TEXT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import org.jetbrains.annotations.NotNull;
import org.telclin.scenario.TelegramScenarioDriver;
import org.telclin.scenario.TelegramScenarioException;
import org.telclin.scenario.TelegramScenarioFunctionPool;
import org.telclin.scenario.particular.TelegramScenarioAbstract;
import org.telclin.tdlib.TdApi;


public class TelegramClientService {

    @Setter
    @Getter
    private static String workingDirectory = "/var/tdlib/";

    private static final ConcurrentMap<Integer, TelegramClientService> telegramClientServices = new ConcurrentHashMap<>();

    private final ConcurrentMap<Long, TdApi.Chat> chats = new ConcurrentHashMap<>();

    private final ConcurrentMap<Long, TdApi.SecretChat> secretChats = new ConcurrentHashMap<>();


    private final TelegramClient telegramClient;

    @Getter
    private final TelegramScenarioDriver telegramScenarioDriver;

    @Getter
    private final TelegramClientProcessor telegramClientProcessor;

    static TelegramClientService getTelegramClientServiceById(int id) {
        return telegramClientServices.get(id);
    }

    static void removeTelegramClientServiceById(int id) {
        telegramClientServices.remove(id);
    }

    public static @NotNull TelegramClientService getInstance(String sessionName, int apiId, String apiHash) throws InterruptedException, TelegramScenarioException {
        return getInstance(sessionName, apiId, apiHash, null, null, null);
    }

    public static @NotNull TelegramClientService getInstance(String sessionName, int apiId, String apiHash,
                                                             String phoneNumber, char[] authenticationCode,
                                                             char[] password) throws InterruptedException, TelegramScenarioException {
        TelegramClientService telegramClientService = new TelegramClientService(sessionName, apiId, apiHash);
        telegramClientServices.put(telegramClientService.telegramClient.getNativeClientId(), telegramClientService);
        telegramClientService.authorize(phoneNumber, authenticationCode, password);
        return telegramClientService;
    }

    @SneakyThrows
    public TelegramClientService(String sessionName, int apiId, @NotNull String apiHash) {
        TelegramClientResponseReceiver.isRunning = true;
        telegramClient = new TelegramClient(this, sessionName, apiId, apiHash);
        TelegramScenarioFunctionPool telegramScenarioFunctionPool = new TelegramScenarioFunctionPool(telegramClient::send, chats::put, secretChats::put, chats::get, secretChats::get);
        telegramClientProcessor = new TelegramClientProcessor(this);
        telegramClientProcessor.setDaemon(true);
        telegramClientProcessor.start();
        telegramScenarioDriver = new TelegramScenarioDriver(sessionName, apiId, apiHash, telegramScenarioFunctionPool);
    }

    @SuppressWarnings("unused")
    public synchronized TdApi.Chat getChat(String chatAlias) throws InterruptedException, TelegramScenarioException {
        TdApi.Chat chat = telegramScenarioDriver.startScenario(FIND_CHAT, chatAlias).getResult();
        if (!chats.containsKey(chat.id)) {
            chats.put(chat.id, chat);
        }
        return telegramScenarioDriver.startScenario(FIND_CHAT, chatAlias).getResult();
    }

    @SuppressWarnings("unused")
    public synchronized TdApi.Chat getChat(Long chatId) throws InterruptedException, TelegramScenarioException {
        if (chats.containsKey(chatId)) {
            return chats.get(chatId);
        }
        return telegramScenarioDriver.startScenario(FIND_CHAT, String.valueOf(chatId)).getResult();
    }

    @SuppressWarnings("unused")
    public synchronized TdApi.User getMe() throws InterruptedException, TelegramScenarioException {
        return telegramScenarioDriver.startScenario(FIND_ME).getResult();
    }

    @SuppressWarnings("unused")
    public synchronized List<TdApi.Chat> loadChats() throws InterruptedException, TelegramScenarioException {
        telegramScenarioDriver.startScenario(LOAD_CHATS);
        return new ArrayList<>(chats.values());
    }

    @SuppressWarnings("unused")
    public synchronized List<TdApi.Chat> deleteChat(long chatId) throws InterruptedException, TelegramScenarioException {
        telegramScenarioDriver.startScenario(DELETE_CHAT, String.valueOf(chatId));
        return new ArrayList<>(chats.values());
    }

    @SuppressWarnings("unused")
    public synchronized TdApi.Messages loadMessages(long chatId, long messageId, int offset, int limit) throws InterruptedException, TelegramScenarioException {
        if (offset > 0) {
            throw new TelegramScenarioException("Parameter offset must be non-positive");
        }
        return telegramScenarioDriver.startScenario(LOAD_MESSAGES,
                String.valueOf(chatId),
                String.valueOf(messageId),
                String.valueOf(offset),
                String.valueOf(limit)).getResult();
    }

    @SuppressWarnings("unused")
    public synchronized TdApi.Message sendMessage(String chatAlias, String message) throws InterruptedException, TelegramScenarioException {
        return telegramScenarioDriver.startScenario(SEND_MESSAGE_TEXT, chatAlias, message).getResult();
    }

    @SuppressWarnings("unused")
    public synchronized TdApi.Message sendPhoto(String chatAlias, String message) throws InterruptedException, TelegramScenarioException {
        return telegramScenarioDriver.startScenario(SEND_MESSAGE_PHOTO, chatAlias, message).getResult();
    }

    @SuppressWarnings("unused")
    public synchronized TdApi.Message sendAudio(String chatAlias, String message) throws InterruptedException, TelegramScenarioException {
        return telegramScenarioDriver.startScenario(SEND_MESSAGE_AUDIO, chatAlias, message).getResult();
    }

    @SuppressWarnings("unused")
    public synchronized TdApi.Message editMessage(long chatId, long messageId, String message) throws InterruptedException, TelegramScenarioException {
        return telegramScenarioDriver.startScenario(CHANGE_MESSAGE_TEXT, String.valueOf(chatId), String.valueOf(messageId), message).getResult();
    }

    @SuppressWarnings("unused")
    public synchronized void deleteMessages(long chatId, long[] messageIds, boolean revoke) throws InterruptedException, TelegramScenarioException {
        String messageIdsInString = Arrays.stream(messageIds).mapToObj(String::valueOf).collect(Collectors.joining("|"));
        telegramScenarioDriver.startScenario(DELETE_MESSAGE_TEXT, String.valueOf(chatId), messageIdsInString, Boolean.toString(revoke));
    }

    @SuppressWarnings("unused")
    public synchronized void downloadFile(int fileId) throws InterruptedException, TelegramScenarioException {
        telegramScenarioDriver.startScenario(DOWNLOAD_FILE, String.valueOf(fileId));
    }

    @SuppressWarnings("unused")
    public synchronized void runCustomScenario(TelegramScenarioAbstract<? extends TdApi.Object> scenario,
                                               Consumer<TdApi.Object> hookOnFinish,
                                               String... args) throws InterruptedException, TelegramScenarioException {
        telegramScenarioDriver.startScenario(scenario, false, hookOnFinish, args);
    }

    @SuppressWarnings("unused")
    public synchronized void close() throws InterruptedException, TelegramScenarioException {
        telegramScenarioDriver.startScenario(LOG_OUT);
    }


    private void authorize(String phoneNumber, char[] authenticationCode, char[] password) throws TelegramScenarioException, InterruptedException {
        telegramScenarioDriver.startScenario(LOG_IN, phoneNumber, new String(authenticationCode), new String(password));
    }

    int getTelegramClientId() {
        return telegramClient.getNativeClientId();
    }


}
