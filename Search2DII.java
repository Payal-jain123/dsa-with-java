import java.util.*;
class Search2DII{
public static int[] search(int[][] matrix,int n,int m,int target){
int row=0;
int col=m-1;
while(row<n && col>=0){
if(matrix[row][col]==target){
return new int[]{row,col};
}
else if(matrix[row][col] < target){
row++;
}
else{
 col--;
}
}
 return new int[] {-1,-1};
}
public static void  main(String[] args){
int[][] matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,27,30}};
int n=5,m=5;
int target=14;
        int[] result = search(matrix, n, m, target);

        if (result[0] == -1 && result[1] == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at row " + result[0] + " and column " + result[1]);
        }
    }
}
