import java.util.Stack;
public class StackImple {
    int top=-1;
int st[]=new int[10];
    void push(int x) {
        if (top >= 10){
            System.out.println("Stack overflow ");
        return;
    }
        top+=1;
        st[top]=x;
    }
    int top()
    {
        if(top==-1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return st[top];
    }
    void pop(){
        if(top==-1) return;
        top-=1;
        }
    int size(){
        return top+1;
    }
    public static void main(String[] args){
        StackImple s =new StackImple();
        s.push(5);
        s.push(2);
        s.push(1);
        s.push(7);
        System.out.println("The top of the stack is : " + s.top());
s.pop();
s.pop();
System.out.println("The top of the stack is : " + s.top());
s.pop();
s.push(9);
s.pop();
System.out.println("The size of the stack is : " + s.size());

    }
}
