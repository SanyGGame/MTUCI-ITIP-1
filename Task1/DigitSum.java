import java.util.Scanner;

public class DigitSum {
    public static int digitSum(double number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
    return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int total = digitSum(number);
        System.out.println(total);
        scanner.close();
    }
}