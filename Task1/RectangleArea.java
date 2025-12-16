import java.util.Scanner;

public class RectangleArea {
    public static double rectangleArea(double height, double width) {
        return (height*width);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextDouble();
        double width = scanner.nextDouble();
        double area = rectangleArea(height, width);
        System.out.println(area);
        scanner.close();
    }
}