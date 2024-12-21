import java.util.Arrays;

public class DPMazeObstaclesMemo {
    static int count(int i, int j, int[][] maze, int[][] dp) {
        // Base cases
        if (i >= 0 && j >= 0 && maze[i][j] == -1) return 0; // Obstacle
        if (i == 0 && j == 0) return 1; // Start position

        if (i < 0 || j < 0) return 0; // Out of bounds

        // If the result is already computed
        if (dp[i][j] != -1) return dp[i][j];

        // Recursive computation: from top and left
        int up = count(i - 1, j, maze, dp);
        int left = count(i, j - 1, maze, dp);

        return dp[i][j] = up + left; // Memoize the result
    }

    public static void main(String[] args) {
        int[][] maze = {
                {0, 0, 0},
                {0, -1, 0},
                {0, 0, 0}
        };
        int n = maze.length;
        int m = maze[0].length;

        // Initialize the dp array with -1
        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        // Compute the number of unique paths
        System.out.println(count(n - 1, m - 1, maze, dp));
    }
}
