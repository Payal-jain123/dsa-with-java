class Pattern7
{
public static void main(String[]args)
{
int row=11
;
for(int i=0;i<=row;i++)
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