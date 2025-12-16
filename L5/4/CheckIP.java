import java.util.regex.*;

public class CheckIP {
        public static void main(String[] args) {

            try {
                String str = "001.248.103.55";
                Pattern pattern = Pattern.compile("^((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])$");
                Matcher matcher = pattern.matcher(str);
                if (matcher.matches()) {
                    System.out.println(str + " - IP-адрес");
                } else {System.out.println(str + " - не IP-адрес");}
            }
            catch (PatternSyntaxException e) {
                System.out.println("Ошибка синтаксиса: " + e.getDescription());
            }
            catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
    }
}