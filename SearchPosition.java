import java.util.*;
class SearchPosition{
public static int insertPosition(int[] arr,int x){
int n=arr.length;

int low=0;
int high=n-1;
int ans=n;
while(low <=high){
int mid=(low+high)/2;
if(arr[mid] >= x){
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
int[] arr={2,3,6,7,8,8,11,11,11,12};
int n=10;
int x=8;
int ind=insertPosition(arr,x);
System.out.println("Answer is:" +ind);
}
}
