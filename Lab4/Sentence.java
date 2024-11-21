import java.util.ArrayList;
import java.util.List;

/**
 * Represents a sentence, which is composed of words and punctuation marks.
 */
public class Sentence {
    /** A list of sentence elements, including words and punctuation marks. */
    private List<Object> sentenceElements = new ArrayList<>();

    /**
     * Constructor for creating a Sentence object from a string.
     * The sentence is split into words and punctuation marks.
     *
     * @param sentence the sentence in string form
     */
    public Sentence(String sentence) {
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            if (word.matches(".*[.,!?]$")) { // Ends with punctuation
                sentenceElements.add(new Word(word.substring(0, word.length() - 1)));
                sentenceElements.add(new Punctuation(word.charAt(word.length() - 1)));
            } else {
                sentenceElements.add(new Word(word));
            }
        }
    }

    /**
     * Retrieves the list of sentence elements (words and punctuation marks).
     *
     * @return the list of sentence elements
     */
    public List<Object> getSentenceElements() {
        return sentenceElements;
    }
}
