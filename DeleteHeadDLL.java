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
public class DeleteHeadDLL{
public static Node convertArr2DLL(int arr[]){
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
public static Node deleteHead(Node head){
if(head==null || head.next==null)
return null;
Node prev=head;
head=head.next;
head.back=null;
prev.next=null;
return head;
}
public static void main(String []argvs){
int[]arr={2,3,4,1,5};
Node head=convertArr2DLL(arr);
head=deleteHead(head);
printDLL(head);
}
}
