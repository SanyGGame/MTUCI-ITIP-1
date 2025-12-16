import java.util.Scanner;

public class Season {
    public static String season(int month) {
        if (month == 1 || month == 2 || month == 12) {
            return "зима";
        }
        if (month == 3 || month == 4 || month == 5) {
            return "весна";
        }
        if (month == 6 || month == 7 || month == 8) {
            return "лето";
        }
        else {
            return "осень";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String whatSeason = season(month);
        System.out.println(whatSeason);
        scanner.close();
    }
}
