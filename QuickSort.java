import java.util.*;
class QuickSort{
public static int partition(int[] arr,int low,int high){
int pivot=arr[low];
int i=low;
int j=high;
while(i<j){
while(arr[i]<=pivot && i<=high-1){
i++;
}
while(arr[j]>pivot && j>=low){
j--;
}
if(i<j){
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
int temp=arr[low];
arr[low]=arr[j];
arr[j]=temp;
return j;
}
public static void qs(int[] arr,int low,int high){
if(low<high){
int pindex=partition(arr,low,high);
qs(arr,low,pindex-1);
qs(arr,pindex+1,high);
}
}
public static int[]  quicksort(int[] arr){
qs(arr,0,arr.length-1);
return arr;
}
public static void main(String[] args){
int[] arr={4,6,3,2,5,8,7,9};
int n=arr.length;
System.out.println(" Before Quicksort : ");
for(int i=0;i<n;i++){
System.out.print(arr[i]+ " ");
}
System.out.println();
quicksort(arr);
System.out.println("After quick sort:");
for(int i=0;i<n;i++){
System.out.print(arr[i] +" ");
}
System.out.println();
}
}
