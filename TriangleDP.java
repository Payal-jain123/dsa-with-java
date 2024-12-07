import java.util.Arrays;
//memoization
public class TriangleDP {
    static int triangle(int i,int j,int[][] arr,int n, int [][]dp){
        if(dp[i][j]!=-1)return dp[i][j];
        if(i==n-1)return arr[n-1][j];
        int down=arr[i][j] + triangle(i+1,j,arr,n,dp);
        int dg=arr[i][j] + triangle(i+1,j+1,arr,n,dp);
        return dp[i][j]=Math.min(down,dg);


    }
    public static void main(String[]args){
        int[][] arr = {{1},
                {2, 3},
                {3, 6, 7},
                {8, 9, 6, 10}};
        int n = arr.length;

        // Initialize the dp array with -1
        int[][] dp = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        // Compute the number of unique paths
        System.out.println(triangle(0,0, arr,n, dp));

    }
}
