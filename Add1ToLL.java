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
class Add1ToLL{
static Node addingOne(Node head){
int carry=helper(head);
if(carry==1){
Node newNode=new Node(1);
newNode.next=head;
return newNode;
}
return head;
}
static int helper(Node temp){
if(temp==null)
return 1;
int carry=helper(temp.next);
temp.data += carry;
if(temp.data<10)
return 0;
temp.data=0;
return 1;
}
static void printLL(Node head){
while(head!=null){
System.out.print(head.data + " ");
head=head.next;
}
System.out.println();
}
public static void main(String[] args){
Node head=new Node(9);
head.next=new Node(9);
head.next.next=new Node(9);
head.next.next.next=null;
System.out.print("Before add 1 to LL : ");
printLL(head);
System.out.print("After Add 1 to LL :" );
Node ans=addingOne(head);
printLL(ans);
}
}

