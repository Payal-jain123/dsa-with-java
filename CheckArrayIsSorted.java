import java.util.*;
class CheckArrayIsSorted
{
public static boolean isSorted(int arr[] , int n)
{
for(int i=1;i<n;i++)
{
if(arr[i] < arr[i-1])
return false;
}
return true;
}
public static void main(String[] args)
{
int n=6;
int arr[]={1,2,4,6,9,11};
System.out.println(isSorted(arr,n));
}
}