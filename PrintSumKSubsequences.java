import java.util.ArrayList;

public class PrintSumKSubsequences {
    public static void printK(int ind, int[] arr, ArrayList<Integer> list, int s, int sum, int n){
        if(ind==n) {
            if (s == sum) {
                System.out.println(list);
                return;
            }
            return;
        }
        list.add(arr[ind]);
        s+=arr[ind];
        printK(ind+1, arr, list, s, sum, n);
        list.remove(list.size()-1);
        s-=arr[ind];
        printK(ind+1, arr, list, s, sum, n);
    }

    public static void main(String[] args){
        int arr[]={1,2,1};
        int sum=2;
        int n=arr.length;
        ArrayList<Integer>list=new ArrayList<>();
        printK(0, arr, list, 0, sum, n);
    }
}