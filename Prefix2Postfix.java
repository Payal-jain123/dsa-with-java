import java.util.Stack;
public class Prefix2Postfix {
    public static String conversionPreToPost(String s) {
        Stack<String> st = new Stack<>();
        int n = s.length();
        int i = n-1;
        while (i >=0) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                st.push(String.valueOf(s.charAt(i)));
            }
            else{
                String t1=st.peek();
                st.pop();
                String t2=st.peek();
                st.pop();
                st.push(t1+t2+s.charAt(i));
            }
            i--;
        }
        return st.peek();
    }
    public static void main(String [] args){
        String exp="/-AB*+DEF";
        System.out.println("Prefix expression is : " + exp);
        System.out.println("Postfix expression is : " + conversionPreToPost(exp));
    }
}
