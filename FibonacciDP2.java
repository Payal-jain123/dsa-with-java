import java.util.Arrays;
import java.util.Scanner;
//Tabulation form
public class FibonacciDP2 {
    public static void main(String[] args){
        System.out.print("Print n no.of fibonacci series :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
         dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
       // it will print th no. of last fibonacci series
        System.out.print("the last Fibonacci number is : ");
        System.out.println(dp[n]);
        //it will print the whole series upto n
        System.out.print("Fibonacci series: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(dp[i] + " ");
        }
    }
}
