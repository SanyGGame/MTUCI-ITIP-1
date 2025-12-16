import java.util.Scanner;

public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return s.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        boolean result = isPalindrome(s);
        System.out.println(result);
        scanner.close();
    }
}
