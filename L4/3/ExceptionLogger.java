import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class ExceptionLogger {

    private static final String LOG_FILE = "errors.log";

    public static void log(Exception e) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.write("[" + LocalDateTime.now() + "] " +
                    e.getClass().getSimpleName() + ": " +
                    e.getMessage() + "\n");
        } catch (IOException ex) {
            System.out.println("Ошибка записи лога: " + ex.getMessage());
        }
    }
}
