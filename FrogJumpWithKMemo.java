import java.util.Arrays;
import java.util.*;
public class FrogJumpWithKMemo {
        // Recursive function to calculate the minimum cost to reach the end
        // from a given index with at most 'k' jumps.
        static int solveUtil(int ind, int[] height, int[] dp, int k) {
            // Base case: If we are at the beginning (index 0), no cost is needed.
            if (ind == 0)
                return 0;
            // If the result for this index has been previously calculated, return it.
            if (dp[ind] != -1)
                return dp[ind];
            int mmSteps = Integer.MAX_VALUE;
            // Loop to try all possible jumps from '1' to 'k'
            for (int j = 1; j <= k; j++) {
                // Ensure that we do not jump beyond the beginning of the array
                if (ind - j >= 0) {
                    // Calculate the cost for this jump and update mmSteps with the minimum cost
                    int jump = solveUtil(ind - j, height, dp, k) + Math.abs(height[ind] - height[ind - j]);
                    mmSteps = Math.min(jump, mmSteps);
                }
            }
            // Store the minimum cost for this index in the dp array and return it.
            return dp[ind] = mmSteps;
        }
        // Function to find the minimum cost to reach the end of the array
        static int solve(int n, int[] height, int k) {
            int[] dp = new int[n];
            Arrays.fill(dp, -1); // Initialize a memoization array to store calculated results
            return solveUtil(n - 1, height, dp, k); // Start the recursion from the last index
        }
        public static void main(String args[]) {
            int height[] = { 30, 10, 60, 10, 60, 50 };
            int n = height.length;
            int k = 2;
            System.out.println(solve(n, height, k)); // Print the result of the solve function
        }
    }

