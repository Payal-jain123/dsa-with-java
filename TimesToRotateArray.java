import java.util.*;
public class  TimesToRotateArray {
 
  public static void main(String args[]) {
 
    int arr[] =  {4,5,6,7,0,1,2,3};
int ans=findRotation(arr);
    System.out.println("The rotation is in the array is: "+ans);
 
  }
   public static int findRotation(int arr[]) //method bnaya h 
{
int n=arr.length;
int index=-1;
int ans=Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      if (arr[i] < ans) {
        ans= arr[i];
index=i;
      }
    }
return index;
  }
}