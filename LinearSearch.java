class LinearSearch
{
public static void main(String[] args)
{
int arr[]={1,2,3,4,5};
int num=4;
System.out.println(num + "is found at index:" +search(arr,num));
}
public  static int  search(int arr[],int num)
{
for(int i=0;i<arr.length;i++)
{
if(arr[i]==num)
{
return i;
}
}
return -1;
}
}