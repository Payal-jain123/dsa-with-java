import java.util.Arrays;

public class DpMinPathGridTabu {
    // Function to calculate the minimum path sum using tabulation
    static int minPath(int n, int m, int[][] matrix) {
        // Initialize the dp array
        int[][] dp = new int[n][m];

        // Fill the dp array iteratively
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = matrix[i][j]; // Starting point
                } else {
                    int up = Integer.MAX_VALUE;   // Default for out-of-bound cells
                    int left = Integer.MAX_VALUE;

                    if (i > 0) {
                        up = dp[i - 1][j] + matrix[i][j];
                    }
                    if (j > 0) {
                        left = dp[i][j - 1] + matrix[i][j];
                    }

                    dp[i][j] = Math.min(up, left); // Choose the minimum path
                }
            }
        }

        // Return the result from the bottom-right corner
        return dp[n - 1][m - 1];
    }

    public static void main(String[] args) {
        // Input grid
        int[][] matrix = {
                {5, 9, 6},
                {11, 5, 2},
        };

        int n = matrix.length;       // Number of rows
        int m = matrix[0].length;    // Number of columns

        // Compute the minimum path sum
        System.out.println(minPath(n, m, matrix));
    }
}
