import java.util.*;

public class SingleElement01 {
    public static int singleNonDuplicate(int[] arr) {
        int n = arr.length; // Size of the array.
        if (n == 1)
            return arr[0];

        for (int i = 0; i < n; i++) {
            // Check for first index:
            if (i == 0) {
                if (arr[i] != arr[i+1])
                    return arr[i];
            }
            // Check for last index:
            else if (i == n - 1) {
                if(arr[i]!=arr[i+1]) 
            return arr[i];
            } else {
             if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1])
                    return arr[i];
            }
        }

        // Dummy return statement:
        return -1;
    }

    public static void main(String[] args) {
        int[] arr =
            {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        int ans = singleNonDuplicate(arr);
        System.out.println("The single element is: " + ans);
    }
}
