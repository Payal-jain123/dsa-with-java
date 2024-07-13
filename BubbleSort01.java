import java.util.*;
class BubbleSort01{
public static void bubble(int[] arr,int n){
for(int i=n-1;i>=0;i--){
int didSwap=0;
for(int j=0;j<=i-1;j++){
if(arr[j]>arr[j+1]){
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
didSwap=1;
}
}
if(didSwap==0){
break;
}
}
System.out.println("After Bubble Sort: ");
for(int i=0;i<n;i++){
System.out.print(arr[i] +" ");
}
System.out.println();
}

public static void main(String[] args){
int[] arr={4,7,23,56,87,14};
int n=arr.length;
System.out.println("Before Bubble Sort: ");
for(int i=0;i<n;i++)
{ 
System.out.print(arr[i] +" ");
}
System.out.println();
bubble(arr,n);
}
}
