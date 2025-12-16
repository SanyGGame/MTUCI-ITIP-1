import java.util.Scanner;

public class CountWords {
    public static int countWords(String sentence) {
        String words[] = sentence.trim().split(" +");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int result = countWords(sentence);
        System.out.println(result);
        scanner.close();
    }
}