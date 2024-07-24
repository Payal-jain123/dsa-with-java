import java.util.*;
class Search2D{
public static boolean  bs(int[] matrix,int target){
int n=matrix.length;
int low=0;
int high=n-1;
while(low<=high){
int mid=(low+high)/2;
if(matrix[mid]==target){
return true;
}
else if(target> matrix[mid]){
low=mid+1;
}
 else{
high=mid-1;
}
}
return false;
}
public static boolean search(int[][] matrix,int n,int m,int target){
for(int i=0;i<n;i++){
if(matrix[i][0]<=target && target<=matrix[i][m-1]){
return bs(matrix[i],target);
}
}
return false;
}
public static void main(String []args){
int[][] matrix={{3,4,7,9},{12,13,16,18},{20,21,23,29}};
int n=3,m=4;
int target=22;
System.out.println(search(matrix,n,m,target));
}
}