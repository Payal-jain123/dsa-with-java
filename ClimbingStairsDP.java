public class ClimbingStairsDP {
//Tabulation form
        // Function to calculate the number of ways to climb stairs
        public static int climbStairs(int n) {
            if (n <= 1) {
                return 1;
            }

            // Array to store the number of ways to reach each step
            int[] dp = new int[n + 1];

            // Base cases
            dp[0] = 1; // 1 way to stay on the ground
            dp[1] = 1; // 1 way to reach the first step

            // Fill the dp array using bottom-up approach
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

            return dp[n];
        }

        public static void main(String[] args) {
            int n = 5; // Example: number of stairs
            System.out.println("Number of ways to climb " + n + " stairs: " + climbStairs(n));
        }
    }



