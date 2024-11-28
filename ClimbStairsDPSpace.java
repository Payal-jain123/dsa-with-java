public class ClimbStairsDPSpace {
    //space optimization
        // Function to calculate the number of ways to climb stairs
        public static int climbStairs(int n) {
            if (n <= 1) {
                return 1;
            }
            int prev1=1;
            int prev2=1;

            // Fill the dp array using bottom-up approach
            for (int i = 2; i <= n; i++) {
                int curri=prev1+prev2;
                prev2=prev1;
                prev1=curri;
            }

            return prev1;
        }

        public static void main(String[] args) {
            int n = 3; // Example: number of stairs
            System.out.println("Number of ways to climb " + n + " stairs: " + climbStairs(n));
        }
    }





