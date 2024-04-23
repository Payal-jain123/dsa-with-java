class Pattern8
{
public static void main(String[]args)
{
int row=10;
for(int i=row-1;i>=0;i--)
{
for(int j=row-i;j>=0;j--)
{
System.out.print(" ");
}
for(int k=0;k<=i;k++)
{
System.out.print("* ");
}

System.out.println();
}

}
}