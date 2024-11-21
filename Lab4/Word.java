import java.util.ArrayList;
import java.util.List;

/**
 * Represents a word, which is composed of a list of letters.
 */
public class Word {
    /** A list of letters that form the word. */
    private List<Letter> letters = new ArrayList<>();

    /**
     * Constructor for creating a Word object from a string.
     * Each character of the string is converted into a Letter object.
     *
     * @param word the word in string form
     */
    public Word(String word) {
        for (char c : word.toCharArray()) {
            letters.add(new Letter(c));
        }
    }

    /**
     * Retrieves the word as a string.
     * Letters from the list are concatenated into a textual representation.
     *
     * @return the word as a string
     */
    public String getWord() {
        StringBuilder word = new StringBuilder();
        for (Letter letter : letters) {
            word.append(letter.getCharacter());
        }
        return word.toString();
    }
}
