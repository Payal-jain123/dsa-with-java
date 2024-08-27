public class NextGreaterStack1 {
    public static int[] findGreater(int[] arr) {
        int n = arr.length;
        int nge[] = new int[n];
        for (int i = 0; i < n; i++) {
            nge[i] = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    nge[i] = arr[j];
                    break;
                }
            }
        }
        return nge;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,1,2,6,0};
        int arr2[] = findGreater(arr);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}