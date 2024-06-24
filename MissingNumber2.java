import java.util.*;
class MissingNumber2
{
public static int missingnumber(int[] arr,int n)
{
        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < n - 1; i++) {
            xor2 = xor2 ^ arr[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ n; //XOR up to [1...N]

        return (xor1 ^ xor2); // the missing number

}
public static void main(String[] args)
{
int n=6;
int arr[]={1,2,3,5,6};
int ans=missingnumber(arr,n);
System.out.println("The missing no. is:"+ans);
}
}
