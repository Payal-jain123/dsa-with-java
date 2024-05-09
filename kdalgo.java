import java.util.*;
class kdalgo
{
public static int m1(int arr[],int n)
{
int max =Integer.MIN_VALUE;
int sum=0;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
max+=arr[j];
}
max =Math.max(max,sum);
}return max;
}
public static void main(String[]args)
{
int arr[]={1,2,3};
int n=arr.length;
int ans=m1(arr,n);
System.out.print(ans);
}
}