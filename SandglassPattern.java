class SandglassPattern  
{  
public static void main(String[] args)  
{  
int row=5;
for(int i=row-1;i>=0;i--)
{
for(int j=(row-i);j>=0;j--)
{
System.out.print(" ");
}
for(int k=0;k<=i;k++)
{
System.out.print("* ");
}
System.out.println();
}

for(int i=0;i<=row;i++)
{
for(int j=(row-i);j>=0;j--)
{
System.out.print("");
}
for(int k=1;k<=i;k++)
{
System.out.print("* ");
}
System.out.println();
}
}
}



