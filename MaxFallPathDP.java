import java.util.*;
//memorization

public class MaxFallPathDP {

    // Function to find the maximum path sum in the matrix using dynamic programming
    static int getMaxUtil(int i, int j, int m, int[][] matrix, int[][] dp) {
        // Base Conditions
        if (j < 0 || j >= m)
            return Integer.MIN_VALUE; // Invalid column index
        if (i == 0)
            return matrix[0][j]; // First row value is the starting point

        if (dp[i][j] != -1)
            return dp[i][j];

        // Calculate three possible paths: moving up, left diagonal, and right diagonal
        int up = matrix[i][j] + getMaxUtil(i - 1, j, m, matrix, dp);
        int leftDiagonal = matrix[i][j] + getMaxUtil(i - 1, j - 1, m, matrix, dp);
        int rightDiagonal = matrix[i][j] + getMaxUtil(i - 1, j + 1, m, matrix, dp);

        // Store the maximum of the three paths in dp
        return dp[i][j] = Math.max(up, Math.max(leftDiagonal, rightDiagonal));
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 10, 4},
                {100, 3, 2, 1},
                {1, 1, 20, 2},
                {1, 2, 2, 1}
        };

        int n = arr.length;   // Number of rows
        int m = arr[0].length; // Number of columns

        // Initialize the dp array with -1
        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        // Compute the maximum falling path sum
        int maxSum = Integer.MIN_VALUE;
        for (int j = 0; j < m; j++) {
            maxSum = Math.max(maxSum, getMaxUtil(n - 1, j, m, arr, dp));
        }

        System.out.println("Maximum Falling Path Sum: " + maxSum);
    }
}
