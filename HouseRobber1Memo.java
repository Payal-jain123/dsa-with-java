import java.util.Arrays;

public class HouseRobber1Memo {
    static int solve(int ind,int[] arr,int dp[]){
        if(ind==0)return arr[ind];
        if(ind<0)return 0;
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int pick=arr[ind]+solve(ind-2,arr,dp);
        int nonPick=solve(ind-1,arr,dp);
        return dp[ind]=Math.max(pick,nonPick);

    }
    public static void main(String[] args){
        int[]arr={2,1,4,9};
        int n=arr.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(solve(n-1,arr,dp));
    }
}
