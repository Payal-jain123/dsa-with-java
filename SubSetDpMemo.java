
import java.util.*;

public class SubSetDpMemo {
        // Helper function to solve subset sum problem using dynamic programming
        static boolean subsetSumUtil(int ind, int target, int[] arr, int[][] dp) {
            // If the target sum is achieved, return true
            if (target == 0)
                return true;

            // If we have considered all elements but haven't reached the target, return false
            if (ind == 0)
                return arr[0] == target;

            // If the result for this subproblem has already been calculated, return it
            if (dp[ind][target] != -1)
                return dp[ind][target] == 0 ? false : true;

            // Try not taking the current element
            boolean notTaken = subsetSumUtil(ind - 1, target, arr, dp);

            // Try taking the current element if it doesn't exceed the target
            boolean taken = false;
            if (arr[ind] <= target)
                taken = subsetSumUtil(ind - 1, target - arr[ind], arr, dp);

            // Store the result in the DP table and return whether either option was successful
            dp[ind][target] = notTaken || taken ? 1 : 0;
            return notTaken || taken;
        }

        // Main function to check if there exists a subset with a given target sum
        public static void main(String args[]) {
            int arr[] = { 1, 2, 3, 4 };
            int k = 4;
            int n = arr.length;
            int dp[][] = new int[n][k + 1];
            for (int row[] : dp)
                Arrays.fill(row, -1);



            // Check if there exists a subset with the given target sum
            if (subsetSumUtil(n - 1, k, arr, dp))
                System.out.println("Subset with the given target found");
            else
                System.out.println("Subset with the given target not found");
        }
    }



