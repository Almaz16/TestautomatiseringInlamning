import java.util.HashMap;

public class MorseLogik {
    private final HashMap<Character, String> textToMorse = new HashMap<>();
    private final HashMap<String, Character> morseToText = new HashMap<>();

    public MorseLogik () {
        // Lägger till alfabetet i HashMaps
        String[][] morseAlphabet = {
                {"A", ".-"}, {"B", "-..."}, {"C", "-.-."}, {"D", "-.."}, {"E", "."},
                {"F", "..-."}, {"G", "--."}, {"H", "...."}, {"I", ".."}, {"J", ".---"},
                {"K", "-.-"}, {"L", ".-.."}, {"M", "--"}, {"N", "-."}, {"O", "---"},
                {"P", ".--."}, {"Q", "--.-"}, {"R", ".-."}, {"S", "..."}, {"T", "-"},
                {"U", "..-"}, {"V", "...-"}, {"W", ".--"}, {"X", "-..-"}, {"Y", "-.--"},
                {"Z", "--.."}, {"Å", ".--.-"}, {"Ä", ".-.-"}, {"Ö", "---."},
                {" ", "/"}  // Mellanslag hanteras som "/"
        };

        for (String[] pair : morseAlphabet) {
            textToMorse.put(pair[0].charAt(0), pair[1]);
            morseToText.put(pair[1], pair[0].charAt(0));
        }
    }

    // Översätt text till morsekod
    public String toMorse(String text) {
        text = text.toUpperCase(); // Omvandlar till versaler
        StringBuilder morse = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (textToMorse.containsKey(c)) {
                morse.append(textToMorse.get(c)).append(" ");
            }
            else {
                // Om tecknet inte finns i morse-tabellen returneras ett felmeddelande
                return " Fel: Ogiltigt tecken ";
            }
        }
        return morse.toString().trim();
    }

    // Översätt morsekod till text
    public String fromMorse(String morse) {
        StringBuilder text = new StringBuilder();
        String[] words = morse.split(" "); // Delar upp morsekoden
        for (String morseChar : words) {
            if (morseToText.containsKey(morseChar)) {
                text.append(morseToText.get(morseChar));
            } else if (morseChar.equals("/")) { // Mellanslag mellan ord
                text.append(" ");
            }
            else {
                // Om morsekoden inte finns i tabellen returneras ett felmeddelande
                return " Fel: Ogiltig morsekod ";
            }
        }
        return text.toString();
    }
}
