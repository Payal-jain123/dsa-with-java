import java.util.*;
class SelectionSort{
public static void selection(int arr[],int n){
for(int i=0;i<=n-2;i++){
int mini=i;
for(int j=i;j<=n-1;j++){
if(arr[j]<arr[mini]){
mini=j;
}
}
int temp=arr[mini];
arr[mini]=arr[i];
arr[i]=temp;
}
System.out.print("After Selection Sort: ");
for(int i=0;i<n;i++){
System.out.print(arr[i] + " ");
}
System.out.println();
}
public static void main(String[] args){
int[] arr={9,24,54,78,12,94,23,18};
int n=arr.length;
System.out.print("Before selection sort : ");
for(int i=0;i<n;i++){
System.out.print(arr[i] + " ");
}
System.out.println();
selection(arr,n);
}
}
