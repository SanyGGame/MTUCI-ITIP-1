import java.util.*;

public class NonRepeat {
    public static String nonRepeat(String numbers) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for (char c : numbers.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        StringBuilder result = new StringBuilder();
        for (char c : numbers.toCharArray()) {
            if (countMap.get(c) <= 3) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(nonRepeat(input));
        scanner.close();
    }
}
