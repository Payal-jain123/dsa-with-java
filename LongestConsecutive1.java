import java.util.*;
class LongestConsecutive1{
public static boolean linearSearch(int arr[],int num){
int n=arr.length;
for(int i=0;i<n;i++)
{
if(arr[i]==num)
return true;
}
return false;


}
public static int longestElement(int[] arr){
int longest=1;
int n=arr.length;
for(int i=0;i<n;i++){
int x=arr[i];
int cnt=1;
while(linearSearch(arr,x+1)== true)
{
x+=1;
cnt+=1;
}
longest=Math.max(longest,cnt);
}
return longest;
}
public static void main(String[] args)
{
int []arr={102,104,1,5,3,78,2,4,103};
int ans=longestElement(arr);
System.out.println("The longest element is:" +ans);
}
}

