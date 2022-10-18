package org.teleclin.scenario;

import java.util.function.Consumer;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.teleclin.scenario.particular.TelegramScenarioAbstract;
import org.teleclin.tdlib.TdApi;

/**
 * Scenario wrapper with scenario, dialog flag and hook on finish
 */
@AllArgsConstructor
final class TelegramScenarioWrapper {
    @NonNull
    final TelegramScenarioAbstract<? extends TdApi.Object> scenario;
    final boolean isDialog;
    final Consumer<TdApi.Object> hookOnFinish;

}
