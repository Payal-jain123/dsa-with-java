public class PalindromeRec {
    public static boolean palindrome(String s,int n,int i){
        if(i>=n/2)return true;
        if(s[i] != s[n-i-1])
            return false;
        return palindrome(i+1,s);
    }
    public static void main(String[] args){
        String s="MADAM";
       System.out.print(palindrome(0,s));
    }
}
