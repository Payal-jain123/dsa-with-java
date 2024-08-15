import java.util.Stack;

public class QueueStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void push(int x) {
        while (!s1.isEmpty()) {
            s2.add(s1.peek());
            s1.pop();
        }
        s1.add(x);
        while (!s2.isEmpty()) {
            s1.add(s2.peek());
            s2.pop();
        }
    }

    int top() {
        return s1.peek();
    }

    void pop() {
        s1.pop();
    }

    int size() {
        return s1.size();
    }

    public static void main(String[] args) {
        QueueStack qs = new QueueStack();
        qs.push(3);
        qs.push(4);
        qs.pop();
        qs.push(5);        qs.push(5);


        System.out.println("The top element is " + qs.top());
        System.out.println("The size of the queue is " + qs.size());
    }
}