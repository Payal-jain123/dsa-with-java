class Pattern15
{
public static void main(String[] payal)
{
int row=6;
for(int i=row-1;i>=1;i--)
{
for(int j=2*(row-i);j>=1;j--)
{
System.out.print("");
}
for(int k=1;k<=i;k++)
{
System.out.print( i+" ");
}
System.out.println();
}
}
}
