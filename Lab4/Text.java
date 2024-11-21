import java.util.ArrayList;
import java.util.List;

/**
 * Represents a text, which is composed of a list of sentences.
 */
public class Text {
    /** A list of sentences that form the text. */
    private List<Sentence> sentences = new ArrayList<>();

    /**
     * Constructor for creating a Text object from a string.
     * The text is split into sentences. Consecutive spaces and tabs are replaced with a single space.
     *
     * @param text the text in string form
     */
    public Text(String text) {
        text = text.replaceAll("\\s+", " "); // Replace tabs and spaces with a single space
        String[] sentenceArray = text.split("\\.\\s*");
        for (String sentence : sentenceArray) {
            if (!sentence.isEmpty()) {
                sentences.add(new Sentence(sentence));
            }
        }
    }

    /**
     * Retrieves the list of sentences in the text.
     *
     * @return the list of sentences
     */
    public List<Sentence> getSentences() {
        return sentences;
    }
}
