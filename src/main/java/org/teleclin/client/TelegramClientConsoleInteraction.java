package org.teleclin.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.function.Function;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.jetbrains.annotations.Nullable;

/**
 * Console interaction helper
 */
@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TelegramClientConsoleInteraction {

    @Setter
    private static Function<String, String> replacer = null;

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
        String interactedResult = applyReplacer(promptInput);
        if (interactedResult != null) return interactedResult;
        System.out.print(String.format("%s", promptInput));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static char[] readPassword(String promptInput) {
        String interactedResult = applyReplacer(promptInput);
        if (interactedResult != null) return interactedResult.toCharArray();
        if (System.console() != null)
            return System.console().readPassword("%s", promptInput);
        return readLine(promptInput).toCharArray();
    }

    private static @Nullable String applyReplacer(String promptInput) {
        if (replacer != null) {
            return replacer.apply(promptInput);
        }
        return null;
    }

}
