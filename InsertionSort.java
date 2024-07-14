import java.util.*;
class 	InsertionSort{
public static void insertion(int[] arr,int n){
for(int i=0;i<=n-1;i++){
int j=i;
while(j>0 && arr[j-1]>arr[j]){
int temp=arr[j-1];
arr[j-1]=arr[j];
arr[j]=temp;
j--;
}
}
System.out.println("After Insertion Sort:");
for(int i=0;i<n;i++){
System.out.print(arr[i] +" ");
}
System.out.println();
}
public static void main(String [] args){
int[] arr={13,24,63,89,15};
int n=arr.length;
System.out.println("Before Insertion sort");
for(int i=0;i<n;i++){
System.out.print(arr[i] +" ");
}System.out.println();
insertion(arr,n);
}
}