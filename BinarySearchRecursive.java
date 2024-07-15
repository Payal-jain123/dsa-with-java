import java.util.*;
class BinarySearchRecursive{
public static int binarysearch(int[] arr,int low,int high ,int target){
if(low>high)
return -1;
int mid=(low+high)/2;
if(arr[mid]==target)
return mid;
else if(target > arr[mid])
return binarysearch(arr,mid+1,high,target);
else
return binarysearch(arr,low,mid-1,target);
}
public static int search(int[] arr,int target){
return binarysearch(arr,0,arr.length-1,target);
}
public static void main(String[] args){
int[] arr={2,4,5,7,9,12,14,16,19,20};
int target=14;
int ind=search(arr,target);
if(ind== -1){

System.out.print("Target is not present");
}
else{
System.out.println("Target is present at index no. : " + ind);
}
}
}
