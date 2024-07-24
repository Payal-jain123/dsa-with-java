import java.util.*;
class Max1sOptimal{
public static int lb(int[]arr,int n,int x){
int low=0;
int high =n-1;
int ans=n;
while(low<=high){
int mid=(low+high)/2;
if(arr[mid]>=x){
ans=mid;
high=mid-1;
}
else{
low=mid+1;
}
}
return ans;}
public static int count(int[][]arr,int n,int m){
int max_cnt=0;
int ind=-1;
for(int i=0;i<n;i++){
int cnt_rows=m-lb(arr[i],m,1);
if(cnt_rows>max_cnt){
max_cnt=cnt_rows;
ind=i;
}}
return ind;
}
public static void main(String[]args){
int[][] arr={{0,0,1,1,1},{0,0,0,0,0},{0,1,1,1,1},{0,0,0,0,0},{0,1,1,1,1}};
int n=5,m=5;
System.out.println(count(arr,n,m));
}
}