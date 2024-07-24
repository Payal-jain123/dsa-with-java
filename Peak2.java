import java.util.*;
class Peak2{
public static int findMax(int[][] matrix,int n,int m,int col){
int max=-1;
int index=-1;
for(int i=0;i<n;i++){
if(matrix[i][col]>max){
max=matrix[i][col];
index=i;
}
}
return index;
}
public static int[] findPeak(int matrix[][],int n,int m){
int low=0;
int high=m-1;
while(low<=high){
int mid=(low+high)/2;
int row=findMax(matrix,n,m,mid);
int left=mid-1 > 0 ?matrix[row][mid-1] :  -1;
int right=mid+1 < m ? matrix[row][mid+1] : -1;
if(matrix[row][mid]>left && matrix[row][mid] >right){
return new int[]{row,mid};
}
else if(matrix[row][mid]<left){
high =mid-1;
}
else{
low=mid+1;
}
}
return new int[]{-1,-1};
}
public static void main(String[] args){
int[][] matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,27,30}};
int n=5,m=5;
        System.out.println(Arrays.toString(findPeak(matrix, n, m)));
}}