class Pattern6
{
public static void main(String[] args)
{
int row = 5;
for(int i=0;i<=row-1;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print(" ");
}
for(int k=0;k<=(row-1-i);k++)
{
System.out.print("* ");
}
System.out.println();
}
}
}