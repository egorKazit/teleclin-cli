package org.teleclin.scenario;

import java.io.File;
import java.util.concurrent.atomic.AtomicLong;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.teleclin.client.TelegramClientService;
import org.teleclin.tdlib.TdApi;

/**
 * TdLib authentication parameter provider
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
class TelegramScenarioTdLibParametersProvider {
    /**
     * Method to prefill the td lib parameters
     *
     * @param object TdApi object
     * @return true if the parameters are needed to set and the parameters are sent
     */
    static boolean getTdLibParameters(TdApi.Object object, String sessionName,
                                      int apiId,
                                      String apiHash,
                                      AtomicLong currentQueryId,
                                      TelegramScenarioFunctionPool functionPool) {
        if (object instanceof TdApi.UpdateAuthorizationState &&
                ((TdApi.UpdateAuthorizationState) object).authorizationState.getConstructor() == TdApi.AuthorizationStateWaitTdlibParameters.CONSTRUCTOR) {
            TdApi.SetTdlibParameters tdlibParameters = new TdApi.SetTdlibParameters();
            tdlibParameters.databaseDirectory = new File(TelegramClientService.getWorkingDirectory(), "connection/tdlib" + sessionName).getPath();
            tdlibParameters.useMessageDatabase = true;
            tdlibParameters.useSecretChats = true;
            tdlibParameters.apiId = apiId;
            tdlibParameters.apiHash = apiHash;
            tdlibParameters.systemLanguageCode = "en";
            tdlibParameters.deviceModel = "Desktop";
            tdlibParameters.applicationVersion = "1.0";
            tdlibParameters.enableStorageOptimizer = true;
            functionPool.sendFunction.accept(currentQueryId.incrementAndGet(), tdlibParameters);
            return true;
        }
        return false;
    }
}
