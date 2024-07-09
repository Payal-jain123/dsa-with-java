import java.util.*;
class SetMaxZeros1{
public static int[][] zeroMatrix(int[][] matrix,int m,int n)
{
int[] row=new int[n];
int[] col=new int[m];
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++){
if(matrix[i][j]==0){
row[i]=1;
col[j]=1;
}
}
}
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
if(row[i]==1 || col[j]==1){
matrix[i][j]=0;
}
}
}return matrix;
}
public static void main(String[] args){
int[][] matrix= {{1,1,1},{1,0,1},{1,0,1}};
int n=matrix.length;
int m = matrix[0].length;
int[][] ans = zeroMatrix(matrix,n,m);
System.out.println("The final matrix is:");
for(int[] row : ans){
for(int ele : row){
System.out.print(ele +" ");
}
System.out.println();
}
}
}