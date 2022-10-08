package org.telclin.function;

import org.telclin.tdlib.TdApi;

/**
 * Custom class for "on logged in" functionality
 */
@CustomSetTdApiFunction
public class SetLoggedIn extends TdApi.Function<TdApi.Ok> {

    public static final int CONSTRUCTOR = 1773323521;

    @Override
    public int getConstructor() {
        return CONSTRUCTOR;
    }
}
