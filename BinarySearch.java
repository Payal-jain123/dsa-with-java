import java.util.*;
class BinarySearch{
public static int search(int[] arr,int n,int target){
int low=0;
int high=n-1;
while(low<=high){
int mid=(low+high)/2;
if(arr[mid]==target)
return mid;
else if(target > arr[mid])
low=mid+1;
else
high = mid-1;
}
return -1;
}
public static void main(String[] args){
int[] arr={2,4,5,7,9,12,14,16,19,20};
int n=arr.length;
int target=21;
int ind=search(arr,n,target);
if(ind== -1){

System.out.print("Target is not present");
}
else{
System.out.println("Target is present at index no. : " + ind);
}
}
}
