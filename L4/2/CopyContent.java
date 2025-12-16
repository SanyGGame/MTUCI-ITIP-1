import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyContent {
    public static void main(String[] args) {
        String source = "input.txt";
        String destination = "output.txt";

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream(source);
            out = new FileOutputStream(destination);
            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }
            System.out.println("Копирование завершено");

        } catch (IOException e) {
            System.out.println("Ошибка при работе c файлами: " + e.getMessage());

        } finally {
            try {
                in.close();
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии входного файла: " + e.getMessage());
            }
            try {
                out.close();
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии выходного файла: " + e.getMessage());
            }
        }
    }
}
