import java.util.*;

public class MaxConsecutiveOnes {

    public static int maxConsecutiveOnes(int[] arr) {
        int maxCount = 0;
        int count = 0;

        for (int num : arr) {
            if (num == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String cleanedLine = line.replaceAll("\\[|\\]", "");
        String[] numberStrings = cleanedLine.split(",");
        int[] numbers = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i].trim());
        }

        System.out.println(maxConsecutiveOnes(numbers));
        scanner.close();
    }
}
