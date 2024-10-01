import java.util.*;  //brute force approach
public class MaxConseOnes1 {
   static int solve(int [] arr,int k){
        int n=arr.length;
        int maxLen=0;
        int len=0;
        for(int i=0;i<n;i++){
            int zeros=0;
            for(int j=0;j<n;j++){
                if(arr[j]==0)
                zeros++;
                if(zeros<=k)
                {
                    len=j-i+1;
                    maxLen=Math.max(maxLen,len);
                }
                else break;
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        int[]arr={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int ans= solve(arr,k);
        System.out.println("Answer is : " + ans);

    }
}
