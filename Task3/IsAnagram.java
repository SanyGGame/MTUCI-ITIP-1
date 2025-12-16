import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().replace(" ", "").split(",");
        String word1 = words[0];
        String word2 = words[1];
        System.out.println(isAnagram(word1, word2));
        scanner.close();
    }
}
