package org.teleclin.function;

import org.teleclin.tdlib.TdApi;

/**
 *
 */
@CustomSetTdApiFunction
public class SetChatFound extends TdApi.Function<TdApi.Ok> {

    public static final int CONSTRUCTOR = 1773323515;

    @Override
    public int getConstructor() {
        return CONSTRUCTOR;
    }
}