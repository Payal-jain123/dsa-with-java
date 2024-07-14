import java.util.*;
class BubbleSortRecursive{
public static void bubble(int[] arr,int n){
if(n==1){
return;}
for(int j=0;j<=n-2;j++)
{
if(arr[j]>arr[j+1]){
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}bubble(arr,n-1);
}
public static void main(String[] args){
int[] arr={9,5,6,3,4,7,2,1};
int n=arr.length;
System.out.println("Before Bubble Sort:");
for(int i=0;i<n;i++){
System.out.print(arr[i] +" ");
}
System.out.println();
bubble(arr,n);
System.out.println("After Bubble Sort:");
for(int i=0;i<n;i++){
System.out.print(arr[i] + " ");
}
System.out.println();
}
}
