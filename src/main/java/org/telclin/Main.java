package org.telclin;

import static org.telclin.client.TelegramClientConsoleInteraction.readLine;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.telclin.client.TelegramClientService;
import org.telclin.scenario.TelegramScenarioException;


@Log4j2
public class Main {
    private static final Map<String, TelegramClientService> telegramClientServices = new HashMap<>();

    @SneakyThrows
    private static TelegramClientService getNewConnection(String newConnectionName) {
        int apiId;
        while (true) {
            try {
                apiId = Integer.parseInt(readLine("Enter api id: "));
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.printf("Can not parse input:  %s%n", numberFormatException.getMessage());
            }

        }
        String apiHash = readLine("Enter api hash: ");
        return TelegramClientService.getInstance(newConnectionName, apiId, apiHash);
    }

    public static void main(String[] args) throws InterruptedException, TelegramScenarioException {

        boolean isRunning = true;
        while (isRunning) {

            String command = readLine("Enter a command: ");
            if (command.equals("connect")) {
                String connectionName = readLine("Enter connection name: ");
                TelegramClientService telegramClientService = telegramClientServices.computeIfAbsent(connectionName, Main::getNewConnection);
                boolean isConnected = true;
                while (isConnected) {

                    command = readLine("Enter command: ");
                    if (command.startsWith("send")) {
                        String[] sendMessageArguments = command.split(" ");
                        if (sendMessageArguments.length < 4) {
                            log.atError().log(String.format("Wrong count of arguments. Expected 4, but provided %s", sendMessageArguments.length));
                            continue;
                        }
                        switch (sendMessageArguments[1]) {
                            case "message":
                                String[] messageContent = Arrays.copyOfRange(sendMessageArguments, 3, sendMessageArguments.length);
                                telegramClientService.sendMessage(sendMessageArguments[2], String.join(" ", messageContent));
                                break;
                            case "audio":
                                telegramClientService.sendAudio(sendMessageArguments[2], sendMessageArguments[3]);
                                break;
                            case "photo":
                                telegramClientService.sendPhoto(sendMessageArguments[2], sendMessageArguments[3]);
                                break;
                            default:
                                log.atError().log("Unrecognized operation");
                        }
                    } else if (command.equals("close")) {
                        telegramClientService.close();
                        telegramClientServices.remove(connectionName);
                        isConnected = false;
                    } else if (command.equals("quit")) {
                        isConnected = false;
                    }
                }
            }
            if (command.equals("quit"))
                isRunning = false;
        }
    }


}
