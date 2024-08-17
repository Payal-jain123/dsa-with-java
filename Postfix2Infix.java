import java.util.Stack;
public class Postfix2Infix {
    public static String conversionPosttoIn(String s) {
        int i = 0;
        Stack<String> st = new Stack<>();
        int n = s.length();
        while (i < n) {
            //operand condition
            if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9'){
               st.push(String.valueOf(s.charAt(i)));
            }
            else {
String t1=st.peek(); st.pop();
String t2=st.peek(); st.pop();
String con='('+t2+s.charAt(i)+t1+')';
st.push(con);
            }
            i++;
            }
        return st.pop();

    }

    public static void main(String[] args) {
        String exp = "AB-DE+F*/";
        System.out.println("Postfix expression: " + exp);
        System.out.println("Infix expression: " + conversionPosttoIn(exp));
    }
}