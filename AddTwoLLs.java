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
class AddTwoLLs{
static Node addingTwo(Node head1,Node head2){
Node t1=head1;
Node t2=head2;
Node dummyNode=new Node(-1);
Node curr=dummyNode;
int carry=0;
while(t1!=null || t2!=null){
int sum=carry;
if(t1!=null)
sum+=t1.data;
if(t2!=null)
sum+=t2.data;
Node newNode=new Node(sum%10);
carry=sum/10;
curr.next=newNode;
curr=curr.next;
if(t1!=null)
t1=t1.next;
if(t2!=null)
t2=t2.next;
}
if(carry>0)
{
Node newNode=new Node(carry);

curr.next=newNode;
}
return dummyNode.next;
}

static void printLL(Node head){
while(head!=null){
System.out.print(head.data + " ");
head=head.next;
}
System.out.println();
}
public static void main(String args[]) {
Node head1=new Node(2);
head1.next=new Node(4);
head1.next.next=new Node(6);
head1.next.next.next=null;
Node head2=new Node(3);
head2.next=new Node(8);
head2.next.next=new Node(7);
head2.next.next.next=null;
Node ans=addingTwo(head1,head2);
printLL(ans);
}
}
