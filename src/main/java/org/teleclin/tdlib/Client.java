//
// Copyright Aliaksei Levin (levlam@telegram.org), Arseny Smirnov (arseny30@gmail.com) 2014-2021
//
// Distributed under the Boost Software License, Version 1.0. (See accompanying
// file LICENSE_1_0.txt or copy at http://www.boost.org/LICENSE_1_0.txt)
//
package org.teleclin.tdlib;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import lombok.Getter;
import org.apache.commons.io.FileUtils;
import org.teleclin.client.TelegramClientService;

/**
 * Main class for interaction with the TDLib.
 */
public final class Client {

    @Getter
    private final int nativeClientId;

    static {
        try {
            URL tdLibJniLibrary = Client.class
                    .getClassLoader().getResource("libtdjni.so");
            if (tdLibJniLibrary == null) {
                throw new LibraryLoadException("Can not find library");
            }
            File folderWithLibrary = new File(TelegramClientService.getWorkingDirectory(), "libs");
            assert folderWithLibrary.exists() || folderWithLibrary.mkdirs();
            File libraryFile = new File(folderWithLibrary, "libtdjni.so");
            if (!libraryFile.exists()) {
                FileUtils.copyURLToFile(tdLibJniLibrary, libraryFile);
            }
            System.load(libraryFile.getPath());
        } catch (UnsatisfiedLinkError | IOException throwable) {
            throwable.printStackTrace();
        }
    }

    public static Client create() {
        return new Client();
    }

    private Client() {
        this.nativeClientId = createNativeClient();
    }

    private static native int createNativeClient();

    public void send(long queryId, TdApi.Function<?> tdApiFunction) {
        nativeClientSend(nativeClientId, queryId, tdApiFunction);
    }

    private static native void nativeClientSend(int nativeClientId, long queryId, TdApi.Function<?> tdApiFunction);

    public static int receive(int[] clientIds, long[] eventIds, TdApi.Object[] events, double var3) {
        return nativeClientReceive(clientIds, eventIds, events, var3);
    }

    private static native int nativeClientReceive(int[] var0, long[] var1, TdApi.Object[] var2, double var3);

    public TdApi.Object execute(TdApi.Function<?> tdApiFunction) {
        return nativeClientExecute(tdApiFunction);
    }

    private static native TdApi.Object nativeClientExecute(TdApi.Function<?> tdApiFunction);

    public void setLogMessageHandler(int logLevel, LogMessageHandler logMessageHandler) {
        nativeClientSetLogMessageHandler(logLevel, logMessageHandler);
    }

    private static native void nativeClientSetLogMessageHandler(int logLevel, LogMessageHandler logMessageHandler);


    public interface LogMessageHandler {
        @SuppressWarnings("unused")
        void onLogMessage(int logLevel, String message);
    }

    public static class LibraryLoadException extends RuntimeException {
        public LibraryLoadException(String message) {
            super(message);
        }
    }

}
