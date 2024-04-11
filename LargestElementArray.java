import java.util.*;
class LargestElementArray
{
public static void main(String[]args)
{
int arr1[] = {2,5,7,0,6};
System.out.println("Largest element in an array:" +findlargestelement(arr1));
int arr2[]={8,2,6,1,5};
System.out.println("Largest element in an array:" +findlargestelement(arr2));
}
public static int findlargestelement(int arr[])
{
int max = arr[0];
for(int i=0;i<arr.length;i++)
{
if(arr[i]>max)
{
max=arr[i];
}
}
return max;
}
}