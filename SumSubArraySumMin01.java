//sum of minimum subarray optimal solution
import java.util.Stack;
public class SumSubArraySumMin01 {
    public static int sumOfMin(int[] arr) {
        int[] nse = findNSE(arr);
        int[] psee = findPSEE(arr);
        int total = 0;
        int mod = (int) (1e9 + 7);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int left = i - psee[i];
            int right = nse[i] - i;
            total = (total + (right * left  * arr[i]) % mod) % mod;
        }
        return total;
    }

    public static int[] findNSE(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nse;
    }

    public static int[] findPSEE(int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pse;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 3, 7, 8, 1};
        int n = arr.length;
        int ans = sumOfMin(arr);
        System.out.println("Sum of subarray minimum is : " + ans);
    }
}