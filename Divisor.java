import java.util.*;

class Divisor {
    public static int largest(int[] arr) {
        int n = arr.length;
        int largest = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int sumByD(int[] arr, int threshold) {
        int n = arr.length;
        for (int d = 1; d<largest(arr); d++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.ceil((double) arr[i] / d);
            }
            if (sum <= threshold) {
                return d;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int threshold = 8;
        int ans = sumByD(arr, threshold);
        if (ans!= -1) {
            System.out.println("The minimum divisor is " + ans);
        } else {
            System.out.println("No such divisor exists");
        }
    }
}