class Pattern9
{
public static void main(String[] args)
{
int row=6;
for(int i=0;i<=row-1;i++)
{
for(int j=row-1;j>=0;j--)
{
System.out.print(" ");
}
for(int k=0;k<=i;k++)
{System.out.print("* ");
}
System.out.println();
}
for(int i=row;i>=0;i--)
{
for(int j=row-1;j>=0;j--)
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