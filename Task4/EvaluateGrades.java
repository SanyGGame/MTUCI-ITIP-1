import java.util.*;

public class EvaluateGrades {
    public static String evaluateGrades(int[] grades) {
        Map<String, Integer> gradeCounts = new LinkedHashMap<>();
        gradeCounts.put("A", 0);
        gradeCounts.put("B", 0);
        gradeCounts.put("C", 0);
        gradeCounts.put("D", 0);
        gradeCounts.put("F", 0);

        for (int grade : grades) {
            if (grade >= 90 && grade <= 100) {
                gradeCounts.put("A", gradeCounts.get("A") + 1);
            } else if (grade >= 80) {
                gradeCounts.put("B", gradeCounts.get("B") + 1);
            } else if (grade >= 70) {
                gradeCounts.put("C", gradeCounts.get("C") + 1);
            } else if (grade >= 60) {
                gradeCounts.put("D", gradeCounts.get("D") + 1);
            } else {
                gradeCounts.put("F", gradeCounts.get("F") + 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        boolean first = true;
        for (Map.Entry<String, Integer> entry : gradeCounts.entrySet()) {
            if (entry.getValue() > 0) {
                if (!first) sb.append(", ");
                sb.append(entry.getKey()).append(": ").append(entry.getValue());
                first = false;
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.replaceAll("\\[|\\]", "");
        String[] parts = line.split(",");
        int[] grades = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            grades[i] = Integer.parseInt(parts[i].trim());
        }

        System.out.println(evaluateGrades(grades));
        scanner.close();
    }
}
