//to print names n time using recursion
import java.util.*;
public class PrintNameRec {
    public static void print(int i,int n){
        if(i>n) { //base condition
            return;
        }
        System.out.println("payal");
        print(i+1,n);
    }
    public static void main(String[]args){
        System.out.println("Enter no. of times  : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(1,n);
        }
    }
