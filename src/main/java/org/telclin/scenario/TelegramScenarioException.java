package org.telclin.scenario;

/**
 * Scenario exception.
 * Should be called on any issue with scenario
 */
public class TelegramScenarioException extends Exception {
    public TelegramScenarioException() {
        super();
    }

    public TelegramScenarioException(Throwable throwable) {
        super(throwable);
    }

    public TelegramScenarioException(String message) {
        super(message);
    }

}
