import java.util.*;
class LeftRotateArray2
{
 static  void solve(int arr[],int n,int k)
{
 int[] temp = new int[k];
 for (int i = n - k; i < n; i++) 
{
 temp[i - n + k] = arr[i];
 }
  for (int i = n - k - 1; i >= 0; i--) {
  arr[i + k] = arr[i];
 }
 for (int i = 0; i < k; i++) {
   arr[i] = temp[i];
    }
  }

public static void main(String[] args)
{
int n=8;
int arr[]={1,2,3,4,5,6,7,8};
int k=4;
solve(arr,n,k);
    System.out.println("After Rotating the elements to left ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
}
}
}