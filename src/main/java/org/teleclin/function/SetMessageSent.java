package org.teleclin.function;

import org.teleclin.tdlib.TdApi;

/**
 * Custom class for "on message sent" functionality
 */
@CustomSetTdApiFunction
public class SetMessageSent extends TdApi.Function<TdApi.Ok> {

    public static final int CONSTRUCTOR = 1773323519;

    @Override
    public int getConstructor() {
        return CONSTRUCTOR;
    }
}
