import java.util.*;
class Hashing01{
public static int hash(int[] arr,int number){
int cnt=0;
int n=arr.length;
for(int i=0;i<n;i++){
if(arr[i]==number)
cnt+=1;
}
return cnt;
}
public static void main(String[] args){
int []arr={1,2,1,3,2,2};
int number=2;
int cnt=hash(arr,number);
System.out.println("answer is:" +cnt);
}
}