import java.util.ArrayList;
import java.util.Scanner;

class Intersection {
    // Function to return a list containing the intersection of the two arrays.
    public static ArrayList<Integer> findIntersection(int a[], int b[]) {
        ArrayList<Integer> res = new ArrayList<>();
        
        int i = 0, j = 0;
        
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++; // Move forward in `a` if a[i] is smaller
            } else if (a[i] > b[j]) {
                j++; // Move forward in `b` if b[j] is smaller
            } else { // a[i] == b[j], meaning it's a common element
                if (res.size() == 0 || res.get(res.size() - 1) != a[i]) { 
                    res.add(a[i]); // Add only if it's not already added (to avoid duplicates)
                }
                i++;
                j++; // Move both pointers to avoid counting the same element multiple times
            }
        }
        
        return res;
    }

    // Main method to test the function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of first array
        System.out.print("Enter size of first array: ");
        int m = sc.nextInt();
        int a[] = new int[m];
        
        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        // Input size of second array
        System.out.print("Enter size of second array: ");
        int n = sc.nextInt();
        int b[] = new int[n];

        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        // Find intersection
        ArrayList<Integer> intersection = findIntersection(a, b);

        // Print result
        System.out.println("Intersection of the two arrays: " + intersection);

        sc.close();
    }
}
