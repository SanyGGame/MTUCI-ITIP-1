import java.util.*;

public class CountIslands {
    public static int countIslands(int[][] grid) {
        int rows = grid.length;
        if (rows == 0) return 0;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    dfs(grid, visited, i, j, rows, cols);
                    count++;
                }
            }
        }

        return count;
    }

    private static void dfs(int[][] grid, boolean[][] visited, int i, int j, int rows, int cols) {
        if (i < 0 || i >= rows || j < 0 || j >= cols) return;
        if (grid[i][j] == 0 || visited[i][j]) return;

        visited[i][j] = true;

        dfs(grid, visited, i + 1, j, rows, cols);
        dfs(grid, visited, i - 1, j, rows, cols);
        dfs(grid, visited, i, j + 1, rows, cols);
        dfs(grid, visited, i, j - 1, rows, cols);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.replaceAll("\\[\\[|\\]\\]", "");
        String[] rows = line.split("\\],\\[");

        int[][] grid = new int[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            String[] nums = rows[i].split(",");
            grid[i] = new int[nums.length];
            for (int j = 0; j < nums.length; j++) {
                grid[i][j] = Integer.parseInt(nums[j].trim());
            }
        }

        System.out.println(countIslands(grid));
        scanner.close();
    }
}
