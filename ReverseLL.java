import java.util.Stack;
class Node{
int data;
Node next;
Node(int data1,Node next1){
this.data=data1;
this.next=next1;
}
Node(int data1){
this.data=data1;
this.next=null;
}
}
public class ReverseLL{
static Node convertArrLL(int[]arr){
Node head=new Node(arr[0]);
Node mover=head;
for(int i=1;i<arr.length;i++){
Node temp=new Node(arr[i]);
mover.next=temp;
mover=mover.next;
}
return head;
}
static void printDLL(Node head){
while(head!=null){
System.out.print(head.data + " ");
head=head.next;
}
System.out.println();
}
static Node reverseLL(Node head){
    Stack<Integer> st = new Stack<>();

Node temp=head;
while(temp!=null){
st.push(temp.data);
temp=temp.next;
}
temp=head;
while(temp!=null){
temp.data=st.pop();
temp=temp.next;
}
return head;
}
public static void main(String[]args){
int[] arr={1,3,2,4};
Node head=convertArrLL(arr);
head=reverseLL(head);
printDLL(head);
}
}