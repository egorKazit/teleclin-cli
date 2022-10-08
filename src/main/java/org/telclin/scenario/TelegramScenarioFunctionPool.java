package org.telclin.scenario;

import java.util.function.BiConsumer;
import java.util.function.Function;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.telclin.tdlib.TdApi;

/**
 * Function pool.
 * Contains all needed function as functional interfaces
 */
@AllArgsConstructor
@Getter
public class TelegramScenarioFunctionPool {

    final BiConsumer<Long, TdApi.Function<? extends TdApi.Object>> sendFunction;
    final BiConsumer<Long, TdApi.Chat> updateChatFunction;
    final BiConsumer<Long, TdApi.SecretChat> updateSecretChatFunction;
    final Function<Long, TdApi.Chat> chatSupplierFunction;
    final Function<Long, TdApi.SecretChat> secretChatSupplierFunction;

}
