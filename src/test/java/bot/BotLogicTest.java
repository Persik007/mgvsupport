package bot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * Тесты для класса BotLogic
 */
class BotLogicTest {

    /**
     * Логика бота
     */
    private final BotLogic botLogic = new BotLogic();

    /**
     * Старт диалога
     */
    @ParameterizedTest
    @MethodSource("provideCommand")
    void testCommand(String input, String expected) {
        Assertions.assertEquals(expected, botLogic.getAnswer(input));
    }


    private static Stream<Arguments> provideCommand(){
        return Stream.of(
                Arguments.of("/start", BotLogic.HELP_MESSAGE),
                Arguments.of("/help", BotLogic.HELP_MESSAGE),
                Arguments.of("как дела?", "Вы набрали как дела?")
        );
    }
}

