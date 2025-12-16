import java.util.*;

public class BruteForce {
    public static List<String> bruteForce(int n, int k) {
        List<String> result = new ArrayList<>();
        if (n == 0) return result; 
        if (n > k) return result;
        String[] alphabet = new String[k];
        for (int i = 0; i < k; i++) {
            alphabet[i] = String.valueOf(i);
        }
        backtrack(result, new ArrayList<>(), alphabet, new boolean[k], n);
        return result;
    }

    private static void backtrack(List<String> result, List<String> path, String[] alphabet, boolean[] used, int n) {
        if (path.size() == n) {
            result.add(String.join("", path));
            return;
        }
        for (int i = 0; i < alphabet.length; i++) {
            if (!used[i]) {
                used[i] = true;
                path.add(alphabet[i]);
                backtrack(result, path, alphabet, used, n);
                path.remove(path.size() - 1);
                used[i] = false;
            }
        }
    }

    public static String formatWithQuotes(String[] arr) {
        if (arr.length == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append("\"").append(arr[i]).append("\"");
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();

        String[] input = line.split(",");
            
        int n = Integer.parseInt(input[0].trim());
        int k = Integer.parseInt(input[1].trim());
            
        List<String> resultList = bruteForce(n, k);
        String[] resultArray = resultList.toArray(new String[0]);
            
        System.out.println(formatWithQuotes(resultArray).replace(" ", ""));

    }
}