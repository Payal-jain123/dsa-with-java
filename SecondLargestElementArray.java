import java.util.*;

class SecondLargestElementArray {
    public static void main(String[] args) {
        int arr1[] = {2, 5, 1, 8, 6};
        System.out.println("Largest element in an array:" + findLargestElement(arr1));
        System.out.println("Second largest element in an array:" + findSecondLargestElement(arr1));
    }

    public static int findLargestElement(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findSecondLargestElement(int arr[]) {
        int largest = findLargestElement(arr);
        int slargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > slargest && arr[i] != largest) {
                slargest = arr[i];
            }
        }
        return slargest;
    }
}