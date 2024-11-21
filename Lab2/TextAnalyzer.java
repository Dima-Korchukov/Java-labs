import java.util.HashSet;
import java.util.Set;

/**
 * The TextAnalyzer class provides functionality to analyze a text.
 * It splits the text into sentences and identifies words from the first sentence 
 * that are not present in other sentences.
 */
public class TextAnalyzer {

    /**
     * The main method that initializes a text, splits it into sentences, and 
     * finds a word from the first sentence that is not present in other sentences.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        try {
            // Ініціалізація тексту
            StringBuilder text = new StringBuilder("Це перше речення. Це друге речення. Ось ще одне речення.");

            // Розбиття тексту на речення
            String[] sentences = text.toString().split("\\.\\s*");

            if (sentences.length > 0) {
                // Розбиття першого речення на слова
                String[] firstSentenceWords = sentences[0].split("\\s+");
                
                // Збір всіх слів з наступних речень
                Set<String> wordsInOtherSentences = new HashSet<>();
                for (int i = 1; i < sentences.length; i++) {
                    String[] words = sentences[i].split("\\s+");
                    for (String word : words) {
                        wordsInOtherSentences.add(word.toLowerCase());
                    }
                }

                // Пошук слова, яке є в першому реченні і відсутнє в інших
                for (String word : firstSentenceWords) {
                    if (!wordsInOtherSentences.contains(word.toLowerCase())) {
                        System.out.println("Слово, якого немає в інших реченнях: " + word);
                        break;
                    }
                }
            } else {
                System.out.println("Текст не містить речень.");
            }
        } catch (Exception e) {
            System.out.println("Сталася помилка: " + e.getMessage());
        }
    }
}
