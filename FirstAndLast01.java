import java.util.*;

class FirstAndLast01 {
    public static int lowerBound(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int upperBound(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int[] firstandlast(int[] arr, int n, int k) {
        int lb = lowerBound(arr, n, k);
        if (lb == n || arr[lb]!= k) {
            return new int[]{-1, -1};
        }
        return new int[]{lb, upperBound(arr, n, k) - 1};
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 5, 8, 9};
        int n = 6;
        int x = 5;
        int ind = lowerBound(arr, n, x);
        if (ind == n) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Answer is: " + ind[0]+ " "+ind[1]);
        }
    }
}