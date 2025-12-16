import java.util.*;

public class DigitHistogram {
    public static int[] digitHistogram(int number) {
        int[] histogram = new int[10];
        String numberStr = String.valueOf(number);
        for (char digitChar : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            histogram[digit]++;
        }
        return histogram;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(Arrays.toString(digitHistogram(input)).replace(" ", ""));
        scanner.close();
    }
}
