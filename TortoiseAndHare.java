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
public class TortoiseAndHare {
static Node convertArrDLL(int[]arr){
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
static Node findmiddle(Node head){
Node slow=head;
Node fast=head;
while(fast!=null && fast.next!=null){
slow=slow.next;
fast=fast.next.next;
}
return slow;
}
public static void main(String[]args){
int[] arr={1,3,2,4,5,8,9};//odd=4
//int[] arr={2,4,3,5,6,7};//even=5
Node head=convertArrDLL(arr);
Node middleNode=findmiddle(head);
System.out.print("The middle node of LL is: " +middleNode.data);
}
}