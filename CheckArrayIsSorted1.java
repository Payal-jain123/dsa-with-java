import java.util.*;
class CheckArrayIsSorted1
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
int n;
Scanner sc=new Scanner(System.in);
System.out.println("array is:"+isSorted(arr[0]));
int arr[]=sc.nextInt();
System.out.println(isSorted(arr,n));
}
}