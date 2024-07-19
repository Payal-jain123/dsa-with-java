import java.util.*;

class MBouquets {
public static int printmax(int []arr){
int n=arr.length;
int max=arr[0];
for(int i=0;i<n;i++){
if(arr[i] >max){
max=arr[i];
}
}
return max;
}
public static int printmini(int []arr){
int n=arr.length;
int mini=arr[0];
for(int i=0;i<n;i++){
if(arr[i] < mini){
mini=arr[i];
}
}
return mini;
}

    public static boolean possible(int[] arr, int day, int m, int k) {
        int cnt = 0, noOfB = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else {
                noOfB += (cnt / k);
                cnt = 0;
            }
        }
        noOfB += (cnt / k);
        return noOfB >= m;
            
    }

    public static int findMinDays(int[] arr, int m, int k) {
        if (arr.length < m * k)
            return -1;
int mini=printmini(arr);
int max=printmax(arr);
        int low = mini, high = max;
while (low <= high) {
            int mid = (low+high) / 2;
            if (possible(arr, mid, m, k)){
                high = mid-1;
            }else{
                low = mid + 1;
        }
}
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {7, 7, 7,7,13, 11, 12, 7};
        int m = 2, k = 3; // define m and k
        int ans = findMinDays(arr, m, k);
 if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + ans);
    }
}
