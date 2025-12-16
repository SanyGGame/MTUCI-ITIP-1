import java.util.regex.*;

public class FindUpperCase {
        public static void main(String[] args) {

            try {
                String str = "ArteMkaiDet";
                Pattern pattern = Pattern.compile("([a-z])([A-Z])");
                Matcher matcher = pattern.matcher(str);
                System.out.println(str + "->" + matcher.replaceAll("!$1$2!"));
            }
            catch (PatternSyntaxException e) {
                System.out.println("Ошибка синтаксиса: " + e.getDescription());
            }
            catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
    }
}