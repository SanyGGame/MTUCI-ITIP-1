import java.util.*;

public class WordHistogram {

    public static Map<String, Integer> wordHistogram(String text) {
        String cleanedText = text.toLowerCase().replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "");
        
        String[] words = cleanedText.split("\\s+");
        
        Map<String, Integer> frequencyMap = new LinkedHashMap<>();
        
        for (String word : words) {
            if (!word.isEmpty()) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }
        
        return frequencyMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, Integer> result = wordHistogram(line);
        System.out.println(result.toString().replace("=", ": "));
        scanner.close();
    }
}
