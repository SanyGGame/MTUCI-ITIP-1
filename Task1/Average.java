import java.util.Scanner;

public class Average {
    public static double average(double a, double b, double c) {
        return ((a+b+c)/3);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        double result = average(a,b,c);
        System.out.println(result);
        scanner.close();
    }
}