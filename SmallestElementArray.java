import java.util.*;
public class  SmallestElementArray {
 
  public static void main(String args[]) {
 
    int arr1[] =  {2,5,1,3,0};
    System.out.println("The Smallest element in the array is: "+findSmallestElement(arr1));
 
    int arr2[] =  {8,10,5,7,9};
    System.out.println("The Smallest element in the array is: "+findSmallestElement(arr2));
  }
   public static int findSmallestElement(int arr[]) //method bnaya h 
{
    int min= arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min= arr[i];
      }
    }
return min;
  }
}