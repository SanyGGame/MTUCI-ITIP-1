import java.util.Scanner;

public class ReverseWords {
    public static String reverseWords(String sentence) {
        String[] parts = sentence.split(" ");
        String result = "";
        for (int i = parts.length - 1; i >= 0; i--) {
            result = result + parts[i] + " ";
        }
    return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String result = reverseWords(sentence);
        System.out.println(result);
        scanner.close();
    }
}