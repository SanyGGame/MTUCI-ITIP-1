import java.util.Scanner;

public class IsEven {
    public static boolean isEven(int number) {
    boolean flag = false;
    if (number % 2 == 0) {
        flag = true;
    }
    return flag;
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean result = isEven(number);
        System.out.println(result);
        scanner.close();
    }
}