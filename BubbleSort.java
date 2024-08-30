import java.util.*;
class BubbleSort{
public static void bubble(int[] arr,int n){
for(int i=n-1;i>=0;i--){
for(int j=0;j<=i-1;j++){
if(arr[j] > arr[j+1]){
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
System.out.println("After Bubble sort : ");
for(int i=0;i<n;i++){
System.out.print(arr[i] + " ");
}
System.out.println();

}
public static void main(String[] args){
int []arr={9,46,54,63,12,35};
int n=arr.length;
System.out.println(" Before Bubble sort : " );
for(int i=0;i<n;i++){
System.out.print(arr[i] + " ");
}
System.out.println();
bubble(arr,n);
}
}
