import java.util.*;  
  
public class UnionOfTwoSortedArrays2 {  
  
    public static void main(String[] args) {  
        int[] arr1 = {1, 3, 3, 5, 7, 7, 9};  
        int[] arr2 = {2, 4, 6, 8, 8, 8, 10};  
        int m = arr1.length;  
        int n = arr2.length;  
        TreeSet<Integer> set = new TreeSet<>();  
  
        // Add all elements of arr1 to the TreeSet  
        for (int i = 0; i < m; i++) {  
            set.add(arr1[i]);  
        }  
  
        // Add all elements of arr2 to the TreeSet  
        for (int i = 0; i < n; i++) {  
            set.add(arr2[i]);  
        }  
  
        // Traverse the TreeSet and print the elements  
        Iterator<Integer> iterator = set.iterator();  
        while (iterator.hasNext()) {  
            System.out.print(iterator.next() + " ");  
        }  
    }  
}  
