import java.util.*;

public class BookAllocation1 {
    public static int countStudents(ArrayList<Integer> arr, int pages) {
        int n = arr.size(); // size of array
        int students = 1;
        long pagesStudent = 0;
        for (int i = 0; i < n; i++) {
            if (pagesStudent + arr.get(i) <= pages) {
                // add pages to current student
                pagesStudent += arr.get(i);
            } else {
                // add pages to next student
                students++;
                pagesStudent = arr.get(i);
            }
        }
        return students;
    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // book allocation impossible
        if (m > n)
            return -1;

        int low = max(arr);
        int high = sum(arr);

        for (int pages = low; pages <= high; pages++) {
            if (countStudents(arr, pages) == m) {
                return pages;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(25, 46, 28, 49, 24));
        int n = 5;
        int m = 4;
        int ans = findPages(arr, n, m);
        System.out.println("The answer is: " + ans);
    }
}
