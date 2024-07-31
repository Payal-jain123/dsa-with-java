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
class DeleteTailDLL{
public static Node convertArr2DLL(int[] arr){
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
public static void printDLL(Node head){
while(head!=null){
System.out.print(head.data +" ");
head=head.next;
}
}
 static Node deleteTail(Node head){
if(head==null || head.next==null){
return null;}
Node tail=head;
while(tail.next!=null){
tail=tail.next;
}
Node prev=tail.back;
prev.next=null;
prev.back=null;
tail.back=null;

return head;
}
public static void main(String[]args){
int[] arr={2,3,1,4,5};
Node head=convertArr2DLL(arr);
head=deleteTail(head);
printDLL(head);
}
}