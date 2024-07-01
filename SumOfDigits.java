import java.util.Scanner;  
public class SumOfDigits  
{  
public static void main(String arg[])  
{  
long number, sum;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter a number: ");  
//reads a long number from the user  
number=sc.nextLong();  
for(sum=0; number!=0; number=number/10)  
{  
//finds the last digit and add it to the variable sum      
sum = sum + number % 10;  
}  
//prints the result  
System.out.println("Sum of digits: "+sum);  
}  
}
