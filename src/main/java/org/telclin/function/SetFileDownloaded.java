package org.telclin.function;

import org.telclin.tdlib.TdApi;

@CustomSetTdApiFunction
public class SetFileDownloaded extends TdApi.Function<TdApi.Ok> {

    public static final int CONSTRUCTOR = 1773323505;

    @Override
    public int getConstructor() {
        return CONSTRUCTOR;
    }
}