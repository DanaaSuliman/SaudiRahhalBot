package ArabicChatbot;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class main {
    public static void main(String[] args) {

        try {
            ApiContextInitializer.init();
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi();

            try {
                telegramBotsApi.registerBot(new MyFirstBot());
                //telegramBotsApi.registerBot(new MyFirstBot2());
                //telegramBotsApi.registerBot(new MyFirstBot3());

            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        } catch (Exception e2) {
            e2.printStackTrace();
        }

    }
}
