import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Testklass{
    private MorseLogik translator;

    @BeforeEach
    void setUp() {
        translator = new MorseLogik();
    }

    @Test
    void testValidTextToMorse() {
        assertEquals(".- .-.. -- .- --.. / .... . .-. -- . --..", translator.toMorse("almaz hermez"));
    }

    @Test
    void testValidMorseToText() {
        assertEquals("HEJ", translator.fromMorse(".... . .---"));
    }

    @Test
    void testInvalidCharacterInTextToMorse() {
        assertEquals("Fel: Ogiltigt tecken ", translator.toMorse("Hej1"));
        assertEquals("Fel: Ogiltigt tecken ", translator.toMorse("Hej@"));
    }

    @Test
    void testInvalidMorseCodeInMorseToText() {
        assertEquals(" Fel: Ogiltig morsekod ", translator.fromMorse("....... ......."));
    }

    @Test
    void testRoundTripConversion() {
        String input = "Test";
        String morse = translator.toMorse(input);
        String output = translator.fromMorse(morse);
        assertEquals(input.toUpperCase(), output);
    }
}
