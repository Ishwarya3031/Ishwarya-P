import java.util.LinkedHashSet;
public class RemoveDuplicates {
    public static String removeDuplicateCharacters(String input) {
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            charSet.add(c); 
        }
        StringBuilder result = new StringBuilder();
        for (char c : charSet) {
            result.append(c);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String input = "banana";
        String output = removeDuplicateCharacters(input);
        System.out.println(output); 
    }
}
