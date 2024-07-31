class Node{
int data;
Node next;
Node(int data1 , Node next1){
this.data=data1;
this.next=next1;
}
Node(int data1){
this.data=data1;
this.next=null;
}
}

public  class InsertNodeVal{
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
static Node insertbeforeele(Node head,int ele,int val){
if(head==null){
return null;
}
if(head.data==val){
return new Node(ele,head);
}
Node temp=head;
while(temp.next!=null){

if(temp.next.data==val){
Node x=new Node(ele,temp.next);
temp.next=x;
break;
}
temp=temp.next;
}
return head;
}

 static void printLL(Node head){
while(head!=null){
System.out.print(head.data + " ");
head=head.next;
}
System.out.println();
}
public static void main(String[] args){
int[] arr={2,5,8,7};
Node head=convertArr2LL(arr);
head=insertbeforeele(head,100,5);
printLL(head);
}}