import java.util.*;
class Search2DOptimal{
public static boolean  bs(int[][] matrix,int target,int n,int m){
int low=0;
int high=n*m-1;
while(low<=high){
int mid=(low+high)/2;
int row=mid/m;
int col=mid%m;
if(matrix[row][col]==target){
return true;
}
else if(target> matrix[row][col]){
low=mid+1;
}
 else{
high=mid-1;
}
}
return false;
}
public static void main(String []args){
int[][] matrix={{3,4,7,9},{12,13,16,18},{20,21,23,29}};
int n=3,m=4;
int target=16;
System.out.println(bs(matrix,target,n,m));
}
}