public class QueueImpleLL {
    Node start,end;
    int size=0;
    void push(int x){
        Node temp=new Node(x);
        if(start== null){
            start=end=temp;
        }
        else
            end.next=temp;

        size+=1;
    }
    void pop(){
        if(start==null)
            return ;
      Node  temp=start;
      start=start.next;
      size-=1;
    }
    int top(){
        if(start==null)
            return -1;
        return start.data;
    }
    int size(){
        return size;
    }
    public static void main(String[]ars){
        QueueImpleLL q=new QueueImpleLL();
        q.push(3);
        q.push(2);
        q.push(4);
        System.out.println("The top of the queue before deleting any element " + q.top());
        q.pop();
        q.pop();
        q.push(42);
        q.push(36);
        q.pop();
        System.out.println("The top  of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size());
    }

}
