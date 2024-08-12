//print numbers n times using recurion
import java.util.*;
public class PrintNumRec {
        public static void print(int i,int n){
            if(i>n) { //base condition
                return;
            }
            System.out.println(i);
            print(i+1,n);
        }
        public static void main(String[]args){
            System.out.println("Enter no. of times  : ");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            print(1,n);
        }
    }