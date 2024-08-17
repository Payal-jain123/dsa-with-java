import java.util.Stack;
public class Infix2Postfix {
    public static String conversionIntopost(String s){
        Stack<Character> st=new Stack<>();
        int i=0;
        String ans="";
        int n=s.length();
        while(i<n){
            //operand condition
            if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9'){
                ans+=s.charAt(i);
            }
            //open bracket condition
            else if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            //closing bracket condition
            else if (s.charAt(i)==')') {
                while(!st.isEmpty() && st.peek()!='('){
                    ans+=st.peek();
                    st.pop();

                }
                st.pop();
            }
            //operator condition
            else{
                while(!st.isEmpty() && priority(s.charAt(i))<=priority(st.peek())){
                    ans+=st.peek();
                    st.pop();
                }
                st.push(s.charAt(i));
            }
            i++;
        }
        while(!st.isEmpty()){
            ans+=st.peek();
            st.pop();
        }
        return ans;
    }
    public static int priority(char c) {
        if (c == '+' || c == '-')
            return 1;
        else if (c == '*' || c == '/')
            return 2;
        else
            return 0;
    }


    public static void main(String[] args) {
        String exp = "(p+q)*(m-n)";
        System.out.println("Infix expression: " + exp);
        System.out.println("Prefix expression: " + conversionIntopost(exp));
    }
}
