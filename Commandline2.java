class Commandline2
{  
public static void main(String args[])  
{  
int a = Integer.parseInt(args[0]); //first arguments   
int b = Integer.parseInt(args[1]); //second arguments 
int c = Integer.parseInt(args[2]);
int d = Integer.parseInt(args[3]);
int e = Integer.parseInt(args[4]); 
int sum = a + b + c + d + e ;
System.out.println("the sum is:"+sum);
int average = sum/5 ; 
System.out.println("The average is: " +average);  
}  
}  