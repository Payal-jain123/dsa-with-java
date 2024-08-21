//back track to print numbers n times
import java.util.*;
public class PrintNumberBackTrackRec {
    public static void print(int i,int n){
        if(i<1)
            return ;
        print(i-1,n);
        System.out.println(i);
    }
    public static void main(String[]args){
        System.out.print("Enter no. of times : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n,n);
    }
}