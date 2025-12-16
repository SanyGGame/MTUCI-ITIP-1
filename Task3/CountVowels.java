import java.util.Scanner;

public class CountVowels {
    public static int countVowels(String word) {
        int counter = 0;
        word = word.toLowerCase();
        for (int i = 0; i <= word.length() - 1; i++) {
            if ((word.charAt(i) == 'a') || (word.charAt(i) == 'e') || (word.charAt(i) == 'i') || (word.charAt(i) == 'o') || (word.charAt(i) == 'u')) {
                counter++;
            }
        }
    return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int result = countVowels(word);
        System.out.println(result);
        scanner.close();
    }
}