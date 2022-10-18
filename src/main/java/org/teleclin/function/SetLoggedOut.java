package org.teleclin.function;

import org.teleclin.tdlib.TdApi;

/**
 * Custom class for "on logged out" functionality
 */
@CustomSetTdApiFunction
public class SetLoggedOut extends TdApi.Function<TdApi.Ok> {

    public static final int CONSTRUCTOR = 1773323523;

    @Override
    public int getConstructor() {
        return CONSTRUCTOR;
    }
}