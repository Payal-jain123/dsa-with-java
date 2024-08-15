import java.util.*;
public class StackQueue {
    Queue<Integer> q=new LinkedList<>();
    //int size=0;
    void push(int x){
        q.add(x);
        for(int i=0;i<q.size()-1;i++){
            q.add(q.peek());
            q.remove();
        }
    }
    void pop(){
        q.remove();
    }
    int top(){
     return q.peek();
    }
    int size(){
        return q.size();
    }
    public static void main(String[]args){
        StackQueue sq=new StackQueue();
        sq.push(3);
        sq.push(2);
        sq.push(4);
        sq.push(1);
        System.out.println("Top of the stack: " + sq.top());
        System.out.println("Size of the stack before removing element: " + sq.size());
        sq.pop();
        System.out.println("Top of the stack after removing element: " + sq.top());
        System.out.println("Size of the stack after removing element: " + sq.size());
    }
}
