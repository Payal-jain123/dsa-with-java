import java.util.Arrays;

public class SJF {
    static int execution(int [] arr,int n){
        Arrays.sort(arr);
        int t=0;
        int wt=0;
        for(int i=0;i<=n-1;i++){
            wt+=t;
            t+=arr[i];

        }
        return (wt/n);
    }
    public static void main(String[] args){
        int[] arr={4,3,7,1,2};
        int n=arr.length;
        System.out.println("Average of SJF is : ");
        System.out.print(execution(arr,n));
    }
}
