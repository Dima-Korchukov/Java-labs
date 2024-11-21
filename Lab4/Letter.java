/**
 * Represents a single letter in a word.
 */
public class Letter {
    /** The character representing the letter. */
    private char character;

    /**
     * Constructor for creating a Letter object.
     *
     * @param character the character representing the letter
     */
    public Letter(char character) {
        this.character = character;
    }

    /**
     * Retrieves the character of the letter.
     *
     * @return the character of the letter
     */
    public char getCharacter() {
        return character;
    }
}
