import java.util.*;

public class SecondLargest {
    public static int secondLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int n : numbers) {
            if (n > largest) {
                second_largest = largest;
                largest = n;
            } else if (n > second_largest && n < largest) {
                second_largest = n;
            }
        }

        return second_largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replace(" ", "").replace("[", "").replace("]", "");
        String[] parts = input.split(",");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }
        System.out.println(secondLargest(numbers));
        scanner.close();
    }
}
