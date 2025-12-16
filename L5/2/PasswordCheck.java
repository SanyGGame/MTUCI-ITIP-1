import java.util.regex.*;

public class PasswordCheck {
        public static void main(String[] args) {
            try {
                String str = "Artem1234";
                Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,16}$");
                Matcher matcher = pattern.matcher(str);
                if (matcher.matches()) {
                    System.out.println("Пароль подходит: " + str);
                }
                else {
                    System.out.println("Пароль не подходит: " + str);
                }
            }
            catch (PatternSyntaxException e) {
                System.out.println("Ошибка синтаксиса: " + e.getDescription());
            }
            catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
    }
}