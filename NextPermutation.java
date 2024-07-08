import java.util.*;

class NextPermutation {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] nextPer(int arr[]) {
        int n = arr.length;
        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            reverse(arr, 0, n - 1);
            return arr;
        }
        for (int i = n - 1; i >= ind; i--) {
            if (arr[i] > arr[ind]) {
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                break;
            }
        }
        reverse(arr, ind + 1, n - 1);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 4, 3, 0, 0};

        int[] a = nextPer(arr);
        System.out.print("The Next Permutation is: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  : ");
        }
        System.out.println(" ");
    }
}
