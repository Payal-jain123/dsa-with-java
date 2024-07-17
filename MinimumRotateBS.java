import java.util.*;
public class  TimesToRotateArray {
 
  public static void main(String args[]) {
 
    int arr1[] =  {4,5,6,7,8,0,1,2,3};
    System.out.println("The minimum element in the array is: "+findMini(arr1));
 
  }
   public static int findMini(int arr[]) //method bnaya h 
{
    int min= arr[0];
int index=-1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min= arr[i];
index=i;
      }
    }
return min;
  }
}