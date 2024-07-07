import java.util.*;
class LeaderArray
{
public static int[] printArray(int[] arr,int n)
{
int[] ans=new int[1];
for(int i=0;i<n;i++)
{
Boolean leader=true;
for(int j=i+1;i<n;i++)
{
if(arr[j]>=arr[i])
{
System.out.print(arr[j]+" ");
}
else{
System.out.println("not a leader");
}
}
}
return ans;
}
public static void main(String [] args)
{
int n=5;
int []arr={10,22,3,5,6,};
int ans[]=printArray(arr,n);
for(int i=0;i<n;i++)
{
System.out.println(arr[i]+" ");
}
}
}