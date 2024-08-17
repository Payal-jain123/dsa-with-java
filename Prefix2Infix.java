import java.util.Stack;
public class Prefix2Infix {
    public static String conversionPreIntoIn(String s) {
        Stack<String> st = new Stack<>();
        int n=s.length();
        int i = n-1;
        while (i >= 0) {
            //operand condition
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                st.push(String.valueOf(s.charAt(i)));
            } else {
                String t1 = st.peek();
                st.pop();
                String t2 = st.peek();
                st.pop();
                String con = '(' + t1 + s.charAt(i) + t2 + ')';
                st.push(con);
            }
            i--;
        }
        return st.peek();

    }

    public static void main(String[] args) {
        String exp = "*+PQ-MN";
        System.out.println("Prefix expression: " + exp);
        System.out.println("Infix expression: " + conversionPreIntoIn(exp));
    }
}
