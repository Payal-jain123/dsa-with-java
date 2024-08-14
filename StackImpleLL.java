public class StackImpleLL {
    Node top;
    int size=0;
    void push(int x){
        Node temp=new Node(x);
        temp.next=top;
        top=temp;
        size=size+1;
    }
    void pop(){
        Node temp=top;
        top=top.next;
        size-=1;
    }
    int top(){
        return top.data;
    }
    int size(){
        return size;
    }
    public static void main(String[]ars){
        StackImpleLL s=new StackImpleLL();
        s.push(4);
        s.push(2);
        s.push(3);
        s.push(1);
        System.out.println("The top is : " +s.top());
        s.pop();
        s.push(7);
        System.out.println("The top is : " +s.top());
        System.out.println("The size is : " +s.size());
    }

}
