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
class RemoveDuplicatesDLL{
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
static void printDLL(Node head){
while(head!=null){
System.out.print(head.data + " ");
head=head.next;
}
System.out.println();
}
static Node removeDuplicates(Node head){
Node temp=head;
while(temp!=null && temp.next!=null){
Node nextNode=temp.next;
while(nextNode!=null && nextNode.data==temp.data){
nextNode=nextNode.next;
}
temp.next=nextNode;
if(nextNode!=null){
nextNode.back=temp;
}

temp=temp.next;
}
return head;
}
public static void main(String[] args){
 int[] arr={1,1,1,2,3,3,3,4,5,5,6};
Node head=convertArr2DLL(arr);
head=removeDuplicates(head);
printDLL(head);
}
}
