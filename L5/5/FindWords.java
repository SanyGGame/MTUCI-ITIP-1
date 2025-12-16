import java.util.regex.*;

public class FindWords {
        public static void main(String[] args) {

            try {
                String letter = "a";
                String str = "Artem Priupolin Denisovich artemka";
                Pattern pattern = Pattern.compile("[" + letter.toLowerCase() + letter.toUpperCase() + "]" + ".*?(\\b)");
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