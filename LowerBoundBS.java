import java.util.*;
class LowerBoundBS{
public static int lowerBound(int[] arr,int n,int x){
int low=0;
int high=n-1;
int ans=n;
while(low <=high){
int mid=(low+high)/2;
if(arr[mid] >=x){
ans=mid;
high=mid-1;
}
else{
low=mid+1;
}
}
return ans;
}
public static void main(String[] args){
int[] arr={2,3,5,6,8,9};
int n=6;
int x=10;
int ind=lowerBound(arr,n,x);
System.out.println("Answer is:" +ind);
}
}
