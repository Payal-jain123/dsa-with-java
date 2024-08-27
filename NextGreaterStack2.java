import java.util.Stack;

public class NextGreaterStack2 {
    public static int[] findGreater(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int nge[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 2, 6, 0};
        int arr2[] = findGreater(arr);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}