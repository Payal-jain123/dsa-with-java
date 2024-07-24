import java.util.*;

public class ReversePairs {

    public static int numberOfInversions(int[] a, int n) {
        // Count the number of pairs:
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > 2* a[j]) cnt++;
            }
        }
        return cnt;
    }


    public static void main(String[] args) {
        int[] a = {4,1,2,3,1};
        int n = 5;
        int cnt = numberOfInversions(a, n);
        System.out.println("The number of inversions is: " + cnt);
    }
}
