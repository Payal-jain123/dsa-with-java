//print number but from N to 1 using recursion
import java.util.*;
public class PrintNumto1Rec {
    public static void print(int i,int n){
        if(i<1) { //base condition
            return;
        }
        System.out.println(i);
        print(i-1,n);
    }
    public static void main(String[]args){
        System.out.println("Enter no. of times  : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n,n);
    }
}
