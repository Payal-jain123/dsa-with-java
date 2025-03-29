import java.util.Stack;
public class Infix2Prefix {
    public static String conversionIntoPre(String s){
        Stack<String> st=new Stack<>();
        s=reverse(s);
        int i=0;
        int n=s.length();
        String ans="";
        while(i<n){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9'){
                ans+=(String.valueOf(s.charAt(i)));
            }
            else if(s.charAt(i)=='('){
                st.push(String.valueOf(s.charAt(i)));
            }
            else if(s.charAt(i)==')'){
                while(!st.isEmpty()&&st.peek()='('){
                    ans += st.peek();
                    st.pop();
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && priority(s.charAt(i)) < priority(st.peek())){
                    ans+=st.peek();
                    st.pop();
                }
                st.push(String.valueOf(s.charAt(i)));
            }
            i++;
        }
        while(!st.isEmpty()){
            ans+=st.peek();
            st.pop();
        }
        ans=reverse(ans);
        return ans;
    }

    public static int priority(char c) {
        if (c == '+' || c == '-')
            return 1;
        else if (c == '*' || c == '/')
            return 2;
        else if (c == '(')
            return 0;
        else
            return 3;
    }

    public static String reverse(String s) {
        String rev = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        String exp = "(p+q)*(m-n)";
        System.out.println("Infix expression: " + exp);
        System.out.println("Prefix expression: " + conversionIntoPre(exp));
    }
}
