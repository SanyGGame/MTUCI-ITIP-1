import java.util.Scanner;

public class DaysToWeeks {
    public static String daysToWeeks(int day) {
        String weeksWord = "";
        String daysWord = "";
        int days = day % 7;
        int weeks = day / 7;
        if (weeks == 0 || weeks >= 5) {
            weeksWord = "недель";
        }
        if (weeks == 1) {
            weeksWord = "неделя";
        }
        if (weeks > 1 && weeks < 5) {
            weeksWord = "недели";
        }
        if (days == 0 || days >= 5) {
            daysWord = "дней";
        }
        if (days == 1) {
            daysWord = "день";
        }
        if (days > 1 && days < 5) {
            daysWord = "дня";
        }
        return weeks + " " + weeksWord + " и " + days + " " + daysWord;
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = daysToWeeks(number);
        System.out.println(result);
        scanner.close();
    }
}