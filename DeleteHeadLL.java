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
class DeleteHeadLL{
static Node convertArr2LL(int[] arr){
Node head=new Node(arr[0]);
Node mover=head;
for(int i=1;i<arr.length;i++){
Node temp=new Node(arr[i]);
mover.next=temp;
mover=temp;
}
return head;
}
static void printLL(Node head){
Node temp=head;
while(head!=null){
System.out.print(head.data + " ");
head=head.next;
}
System.out.println();
}
static Node deleteHead(Node head){
if(head==null)
return head;

head=head.next;

return head;
}
public static void main(String[] args){
int []arr={2,3,4,5};
Node head=convertArr2LL(arr);
head=deleteHead(head);
printLL(head);
}
}