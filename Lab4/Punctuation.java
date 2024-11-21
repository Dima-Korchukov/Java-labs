/**
 * Represents a punctuation mark.
 */
public class Punctuation {
    /** The character representing the punctuation mark. */
    private char punctuation;

    /**
     * Constructor for creating a Punctuation object.
     *
     * @param punctuation the character representing the punctuation mark
     */
    public Punctuation(char punctuation) {
        this.punctuation = punctuation;
    }

    /**
     * Retrieves the punctuation character.
     *
     * @return the punctuation character
     */
    public char getPunctuation() {
        return punctuation;
    }
}
