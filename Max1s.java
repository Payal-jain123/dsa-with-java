import java.util.*;
class Max1s{
public static int count(int[][] arr,int n,int m){
int max_cnt=0;
int index=-1;
for(int i=0;i<n;i++){
int cnt_row=0;
for(int j=0;j<m;j++){
cnt_row += arr[i][j];
}
if(cnt_row > max_cnt){
max_cnt=cnt_row;
index=i;
}}
return index;
}
public static void main(String[] args){
int[] []arr={{0,0,1,1,1},{0,0,0,0,0},{0,1,1,1,1},{0,0,0,0,0},{0,1,1,1,1}};
int n=5;
int m=5;
System.out.println(count(arr,n,m));
}
}
