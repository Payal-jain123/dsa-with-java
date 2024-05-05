class Main3
{
static void Pattern5(int N)
{
for(int i=0;i<=N;i++)
{
for(int j=N;j>i;j--)
{
System.out.print(N-j+1+ " ");
}
System.out.println();
}
}
public static void main(String[]args)
{
int N=6;
Pattern5(N);
}
}