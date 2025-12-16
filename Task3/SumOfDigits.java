import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int number) {
        int counter = 0;
        while (number != 0) {
            counter += number % 10;
            number = number / 10;
        }
    return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = sumOfDigits(number);
        System.out.println(result);
        scanner.close();
    }
}