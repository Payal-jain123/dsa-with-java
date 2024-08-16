import java.util.Stack;

public class MinStackOptimal {
    Stack<Integer> st = new Stack<>();
    int mini;

    void push(int val) {
        if (st.isEmpty()) {
            st.push(val);
            mini = val;
        } else if (val < mini) {
            st.push(2 * val - mini);
            mini = val;
        } else {
            st.push(val);
        }
    }

    int top() {
        if (st.peek() < mini) {
            return mini;
        } else {
            return st.peek();
        }
    }

    void pop() {
        if (st.peek() < mini) {
            mini = 2 * mini - st.peek();
        }
        st.pop();
    }

    int getMin() {
        return mini;
    }

    public static void main(String[] args) {
        MinStackOptimal s = new MinStackOptimal();
        s.push(12);
        s.push(15);
        s.push(10);
        System.out.println("Min is : " + s.getMin());
        s.pop();
        System.out.println("Top is : " + s.top());
        System.out.println("Min is : " + s.getMin());
    }
} 