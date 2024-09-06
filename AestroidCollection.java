import java.util.Stack;

import static java.lang.Math.abs;

public class AestroidCollection {
    public static Stack<Integer> aestroid(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                st.push(arr[i]);
            } else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < abs(arr[i])) {
                    st.pop();
                }
                if (!st.isEmpty() && st.peek() == abs(arr[i])) {
                    st.pop();
                } else if (st.isEmpty() || st.peek() < 0) {
                    st.push(arr[i]);
                }
            }
        }
        return st; // Return the entire stack
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 1, 2, -3, -7, 17, 15, -16};
        int n = arr.length;
        Stack<Integer> ans = aestroid(arr);
        System.out.println("The Final state of all aestroid after collision are: " + ans);
    }
}