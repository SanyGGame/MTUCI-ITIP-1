import java.util.*;

public class PairDifference {
    public static String pairDifference(int[] arr, int number) {
        int count = 0;
        Map<Integer, Integer> frequency = new HashMap<>();
        
        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        
        if (number == 0) {
            for (int freq : frequency.values()) {
                count += freq * (freq - 1) / 2;
            }
        } else {
            for (int num : frequency.keySet()) {
                if (frequency.containsKey(num + number)) {
                    count += frequency.get(num) * frequency.get(num + number);
                }
            }
        }
        
        return String.valueOf(count);
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        String[] parts = line.split("],");
        String arrayPart = parts[0].replace("[", "").trim();
        String numberPart = parts[1].trim();
        String[] numberStrings = arrayPart.split(",");
        int[] numbers = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i].trim());
        }
        int difference = Integer.parseInt(numberPart);
        System.out.println(pairDifference(numbers, difference));
    }
}
