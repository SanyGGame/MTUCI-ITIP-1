import java.util.Scanner;

public class ToFahrenheit {
    public static double toFahrenheit(double celcius) {
        return (celcius * 9/5 + 32);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        double fahrenheit = toFahrenheit(celsius);
        System.out.println(fahrenheit);
        scanner.close();
    }
}