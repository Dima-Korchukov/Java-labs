import java.util.ArrayList;
import java.util.List;

/**
 * The main class for analyzing a text.
 * Performs the following tasks:
 * 1. Splits the text into sentences.
 * 2. Prints all sentences in the original format.
 * 3. Finds a word in the first sentence that does not appear in other sentences.
 */
public class TextAnalyzer {
    /**
     * The main method that executes the program.
     * Initializes the text, processes it, and prints the results to the console.
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        try {
            // Initialize the text
            String textContent = "Це перше речення. Це друге речення.     Ось ще одне     речення.";
            Text text = new Text(textContent);

            // Print all sentences
            System.out.println("Всі речення:");
            for (Sentence sentence : text.getSentences()) {
                StringBuilder sentenceOutput = new StringBuilder();
                for (Object element : sentence.getSentenceElements()) {
                    if (element instanceof Word) {
                        sentenceOutput.append(((Word) element).getWord()).append(" ");
                    } else if (element instanceof Punctuation) {
                        sentenceOutput.append(((Punctuation) element).getPunctuation());
                    }
                }
                System.out.println(sentenceOutput.toString().trim());
            }

            // Analyze the text
            System.out.println("\nАналіз речень:");
            if (text.getSentences().size() > 0) {
                Sentence firstSentence = text.getSentences().get(0);
                List<String> wordsInOtherSentences = new ArrayList<>();

                // Collect words from other sentences
                for (int i = 1; i < text.getSentences().size(); i++) {
                    Sentence sentence = text.getSentences().get(i);
                    for (Object element : sentence.getSentenceElements()) {
                        if (element instanceof Word) {
                            wordsInOtherSentences.add(((Word) element).getWord().toLowerCase());
                        }
                    }
                }

                // Find a unique word from the first sentence
                for (Object element : firstSentence.getSentenceElements()) {
                    if (element instanceof Word) {
                        String word = ((Word) element).getWord();
                        if (!wordsInOtherSentences.contains(word.toLowerCase())) {
                            System.out.println("Слово, яке відсутнє в інших реченнях:" + word);
                            break;
                        }
                    }
                }
            } else {
                System.out.println("В тексті немає речень.");
            }
        } catch (Exception e) {
            System.out.println("помилка: " + e.getMessage());
        }
    }
}
