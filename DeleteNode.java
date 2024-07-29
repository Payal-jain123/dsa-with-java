class Node{
int data;
Node next;
Node(int data1,Node next1){
this.data=data1;
this.next=next1;
}
Node(int data1){
this.data=data1;
this.next=null;}
}
public class DeleteNode{
public static Node convertArr2LL(int arr[]){
Node head=new Node(arr[0]);
Node mover=head;
for(int i=1;i<arr.length;i++){
Node temp=new Node(arr[i]);
mover.next=temp;
mover=temp;
}
return head;
}
public static void printLL(Node head){
while(head!=null){
System.out.print(head.data + " ");
head=head.next;
}
System.out.println();
}
public static Node delete(Node head,int k){
if(head== null)
return head;
if(k==1){
Node temp=head;
head=head.next;
return head;}
int cnt=0;
Node prev=null;
Node temp=head;
while(temp!=null){
cnt++;
if(cnt==k){
prev.next=prev.next.next;
break;
}
prev=temp;
temp=temp.next;
}
return head;
}
public static void main(String[] args){
int[] arr={1,3,2,4};
Node head=convertArr2LL(arr);
head=delete(head,3);
printLL(head);
}}