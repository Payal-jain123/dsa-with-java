import java.util.Stack;
public class NextGreaterElement2 {
    public static int[] findGreater(int[] arr) {
    int n = arr.length;
    Stack<Integer> st = new Stack<>();
    int nge[] = new int[n];
    for(int i = 2*n - 1; i >= 0;i--) {
        while (!st.isEmpty() && st.peek() <= arr[i%n]) {
            st.pop();
        }
        if (i<n) {
            nge[i] = st.isEmpty() ? -1 : st.peek();
        }

        st.push(arr[i%n]);
    }
    return nge;
}

    public static void main(String[] args) {
        int[] arr = {2,10,12,1,11};
        int arr2[] = findGreater(arr);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

}