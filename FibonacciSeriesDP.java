import java.util.*;

class FibonacciSeriesDP {
    static int f(int n, int[] dp) {
        if (n <= 1) return n;
        
        if (dp[n] != -1) return dp[n];
        
        return dp[n] = f(n - 1, dp) + f(n - 2, dp);
    }

    public static void main(String args[]) {
System.out.print("Print the following numbers of fibonacci series :");
Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();  // Fibonacci series up to the 5th number
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        
        // Loop to print all Fibonacci numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            System.out.print(f(i, dp) + " ");
        }
    }
}
