package bot;

import io.github.cdimascio.dotenv.Dotenv;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    /**
     * Main
     */

    /**
     * Берет токены из .env, запускает tg-bot
     */
     static void main() throws TelegramApiException {

        Dotenv dotenv = Dotenv.load();
        String botUsername = dotenv.get("BOT_NAME");
        String botToken = dotenv.get("BOT_TOKEN");

        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        botsApi.registerBot(new TelegramBot(botUsername, botToken));
    }
}