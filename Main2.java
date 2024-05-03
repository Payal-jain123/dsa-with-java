class Main2
{
static void Pattern5(int N)
{
for(int i=1;i<=N;i++)
{
for(int j=N;j>=1;j--)
{
System.out.print(j+ " ");
}
System.out.println();
}
}
public static void main(String[]args)
{
int N=5;
Pattern5(N);
}
}