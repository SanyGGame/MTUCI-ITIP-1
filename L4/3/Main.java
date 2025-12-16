import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        String input = scanner.nextLine();

        try {
            if (!input.matches("-?\\d+")) {
                throw new CustomInputMismatchException("Введено не число: " + input);
            }

            int value = Integer.parseInt(input);
            System.out.println("Вы ввели число: " + value);

        } catch (CustomInputMismatchException e) {
            System.out.println("Ошибка: " + e.getMessage());
            ExceptionLogger.log(e);
        }
    }
}
