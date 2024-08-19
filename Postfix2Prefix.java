import java.util.Stack;

public class Postfix2Prefix {
    public static String conversionPostToPre(String s) {
        Stack<String> st = new Stack<>();
        int i = 0;
        int n = s.length();
        while (i < n) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                st.push(String.valueOf(s.charAt(i)));
            }
            else{
                String t1=st.peek();
                st.pop();
                String t2=st.peek();
                st.pop();
                st.push(s.charAt(i)+t2+t1);
            }
            i++;
        }
        return st.peek();
    }
    public static void main(String [] args){
        String exp="AB-DE+F*/";
        System.out.println("Postfix expression is : " + exp);
        System.out.println("Prefix expression is : " + conversionPostToPre(exp));
    }
}