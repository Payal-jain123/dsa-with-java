
import java.util.*;

class SubSetDpSpace {
    // Function to check if there exists a subset with a given target sum
    static boolean subsetSumToK(int n, int k, int[] arr) {
        // Create an array to store the previous row of the DP table
        boolean prev[] = new boolean[k + 1];
        
        // Initialize the first row of the DP table
        prev[0] = true;

        // Initialize the first column of the DP table
        if (arr[0] <= k) {
            prev[arr[0]] = true;
        }

        // Fill in the DP table using bottom-up approach
        for (int ind = 1; ind < n; ind++) {
            // Create an array to store the current row of the DP table
            boolean cur[] = new boolean[k + 1];
            
            // Initialize the first column of the current row
            cur[0] = true;
            
            for (int target = 1; target <= k; target++) {
                // Calculate if the current target can be achieved without taking the current element
                boolean notTaken = prev[target];
                
                // Calculate if the current target can be achieved by taking the current element
                boolean taken = false;
                if (arr[ind] <= target) {
                    taken = prev[target - arr[ind]];
                }
                
                // Store the result in the current row of the DP table
                cur[target] = notTaken || taken;
            }
            
            // Update the previous row with the current row
            prev = cur;
        }

        // The final result is stored in the last cell of the previous row
        return prev[k];
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4 };
        int k = 4;
        int n = arr.length;

        // Check if there exists a subset with the given target sum
        if (subsetSumToK(n, k, arr))
            System.out.println("Subset with the given target found");
        else
            System.out.println("Subset with the given target not found");
    }
}

