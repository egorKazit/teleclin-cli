package org.telclin.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

/**
 * Console interaction helper.
 * In general in writes some infor for
 */
@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TelegramClientConsoleInteraction {

    /**
     * Method to write a line in the console and read a user response from the console
     *
     * @param promptInput
     * @return input result
     */
    @SneakyThrows
    @SuppressWarnings("all")
    public static String readLine(String promptInput) {
        if (System.console() != null) {
            return System.console().readLine("%s", promptInput);
        }
        System.out.print(String.format("%s", promptInput));
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));
        return reader.readLine();
    }

    public static char[] readPassword(String promptInput) {
        if (System.console() != null)
            return System.console().readPassword("%s", promptInput);
        return readLine(promptInput).toCharArray();
    }

}
