import java.util.*;

public class IsTriangle {
    public static boolean isTriangle(int[] numbers) {
        int a = numbers[0];
        int b = numbers[1];
        int c = numbers[2];

        return (a+b>c) && (a+c>b) && (b+c>a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replace(" ", "");
        String[] parts = input.split(",");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }
        System.out.println(isTriangle(numbers));
        scanner.close();
    }
}
