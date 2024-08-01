class Node{
int data;
Node next;
Node back;
Node(int data1,Node next1,Node back1){
this.data=data1;
this.next=next1;
this.back=back1;
}
Node(int data1){
this.data=data1;
this.next=null;
this.back=null;
}
}
public class DeleteKthvalDLL{
static Node convertArr2DLL(int[] arr){
Node head=new Node(arr[0]);
Node prev=head;
for(int i=1;i<arr.length;i++){
Node temp=new Node(arr[i]);
prev.next=temp;
temp.back=prev;
prev=prev.next;
}
return head;
}
static void printDLL(Node head){
while(head!=null){
System.out.print(head.data + " ");
head=head.next;
}
}
static Node deleteNodeval(Node temp){
Node prev=temp.back;
Node front=temp.next;
if(front==null){
prev.next=null;
temp.back=null;
}
prev.next=front;
front.back=prev;
temp.next=temp.back=null;
}
public static void main(String[]args){
int[] arr={21,32,45,14};
Node head=convertArr2DLL(arr);
deleteNodeval(head.next.next);
printDLL(head);
}
}