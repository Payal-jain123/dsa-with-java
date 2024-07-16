import java.util.*;
class Firstandlast{
public static int[] fandl(int[] arr,int n,int x){
int first =-1,last=-1;
for(int i=0;i<n;i++){
if(arr[i]==x){
if(first==-1){
first=i;
}
last=i;
}
}
return new int[] {first,last};
}
public static void main(String[] args){
int[] arr={2,4,6,8,8,8,11,13};
int n=8;
int x=8;
int[] ans=fandl(arr,n,x);
System.out.println("answer is" +ans[0]+ " , " +ans[1]);
}
}