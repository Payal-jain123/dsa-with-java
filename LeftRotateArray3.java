import java.util.*;
class LeftRotateArray3
{
 static  void solve(int arr[],int n,int d)
{
 int[] temp = new int[d];
 for (int i = 0; i < d; i++) 
{
temp[i]=arr[i];
 }
  for (int i =  d ; i<n; i++) {
  arr[i -d] = arr[i];
 }
 for (int i = n-d; i < n; i++) {
   arr[i] = temp[i-(n-d)];
    }
  }

public static void main(String[] args)
{
int n=8;
int arr[]={1,2,3,4,5,6,7,8};
int d=4;
solve(arr,n,d);
    System.out.println("After Rotating the elements to left ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
}
}
}