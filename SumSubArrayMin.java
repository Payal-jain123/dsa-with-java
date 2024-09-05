//Sum of subarrays minimum brute force approach
public class SumSubArrayMin {
    public static int sumOfmin(int [] arr){
        int sum=0;
        int  mod=(int)(1e9+7);
        int n=arr.length;
        for(int i=0;i<n;i++){
            int mini=arr[i];
            for(int j=i;j<n;j++){
                mini=Math.min(mini,arr[j]);
                sum=(sum+mini)%mod;
            }
        }
                return sum;
    }
    public static void main(String[] args){
        int [] arr={1,4,6,7,3,7,8,1};
        int n=arr.length;
        int ans=sumOfmin(arr);
        System.out.println("Sum of subbarray minimum is : " + ans);
    }
}
