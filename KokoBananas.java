import java.util.*;

public class KokoBananas {
public static int printLargest(int[] arr)
{
int n=arr.length;
int largest=arr[0];
for(int i=0;i<n;i++){
if(arr[i] >largest){
largest=arr[i];
}
}
return largest;    
}

    public static int calculateTotalHours(int[] arr, int hourly) {
        int totalH = 0;
        int n = arr.length;
        //find total hours:
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil(arr[i]/hourly);
}
        return totalH;
    }

    public static int minimumRateToEatBananas(int[] arr, int h) {
        int low = 1, high = printLargest(arr);

        //apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = calculateTotalHours(arr, mid);
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {30,11,23,4,20};
        int h = 8;
        int ans = minimumRateToEatBananas(arr, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
}
