import java.util.Scanner;  
public class Armstrong
{  
public static int  isArmstrong(int n)   
{   
int temp, cnt=0, ld=0, sum=0;   
temp=n;   
while(n>0)    
{   
n = n/10;   
cnt++;   
ld = n % 10;   
sum +=  (Math.pow(ld, cnt));   
n = n/10;   

}   
}
public static void main(String[] args) {
        int number = 153;
int temp,sum;
        if (temp== sum) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
