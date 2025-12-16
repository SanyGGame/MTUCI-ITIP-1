import java.util.regex.*;

public class FindNumbers {
        public static void main(String[] args) {
            try {
                String str = "artem-132alex2dsdas24141";
                Pattern pattern = Pattern.compile("-?\\d+[.]?\\d*");
                Matcher matcher = pattern.matcher(str);
                while (matcher.find()) {
                    System.out.println(matcher.group());
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
