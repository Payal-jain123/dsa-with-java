class Leftpascaltriangle
{
public static void main(String[]args)
{
int row=4;
for(int i=0;i<=row;i++)
{
for(int j=2*(row-i);j>=0;j--)
{
System.out.print(" ");
}
for(int k=0;k<=i;k++)
{
System.out.print("* ");
}
System.out.println();
}
for(int i=row-1;i>=0;i--)
{
for(int j=2*(row-i);j>=0;j--)
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

