import java.util.Scanner;
class Prime2{
public static void main(String[] args)
{
int i,n,m=0,flag=0;
Scanner ac=new Scanner(System.in);
System.out.println("enter a no:");
n=ac.nextInt();
m=n/2;
if(n==0||n==1)
{
System.out.println("not prime");
}
else{
for(i=2;i<=m;i++)
{
if(n%i==0)
{
System.out.println("not peimr");
flag=1;
break;
}
}
}
if(flag==0)
{
System.out.println(" prime");
}
}
}


