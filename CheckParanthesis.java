import java.util.Stack;
public class CheckParanthesis {
public static boolean toCheck(String s){
    Stack<Character> st = new Stack<>();
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            st.push(s.charAt(i));
        else{
            if(st.isEmpty())
                return false;
            char ch=st.peek();
            st.pop();
            if(s.charAt(i)==')' && ch=='(' || s.charAt(i)=='}' && ch=='{' || s.charAt(i)==']' && ch=='[')
                continue;
            else
                return false;
    }
    }
    return st.isEmpty();
}
 public static void main(String[] args){
   // String s="()[{}(]";
     String s="({}[])";
    if(toCheck(s)){
        System.out.println("It is Balanced parantheses : ");
    }
    else
        System.out.println("It is not Balanced parantheses : ");

}
}
