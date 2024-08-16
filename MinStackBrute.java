
import java.util.Stack;

public class MinStackBrute {
    Stack<Integer> st = new Stack<>();

    void push(int val) {
        if (st.isEmpty())
            st.push(new Integer(val, val));
        else
            st.push(new Integer(val, Math.min(val, st.peek().min)));
    }

    int getMin() {
        return st.peek().min;
    }

    void pop() {
        st.pop();
    }

    int top() {
        return st.peek().val;
    }

    static class Integer {
        int val;
        int min;

        Integer(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    public static void main(String[] args) {
        MinStackBrute s = new MinStackBrute();
        s.push(12);
        s.push(15);
        s.push(10);
        System.out.println("Min is : " + s.getMin());
        s.pop();
        System.out.println("Top is : " + s.top());
        System.out.println("Min is : " + s.getMin());
    }
}

