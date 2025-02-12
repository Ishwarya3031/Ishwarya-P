import java.util.HashMap;
import java.util.Map;
public class WordCount {
    public static Map<String, Integer> countWords(String paragraph) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = paragraph.split("\\s+");
        for (String word : words) {
            word = word.toLowerCase();
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        return wordCountMap;
    }
    public static void main(String[] args) {
        String paragraph = "the cat and the hat";
        Map<String, Integer> result = countWords(paragraph);
        System.out.println(result);
    }
}
