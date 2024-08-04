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
class LengthLoopLL{
static int findLength(Node slow,Node fast){
int cnt=1;
fast=fast.next;
while(slow!=fast){
cnt++;
fast=fast.next;
}
return cnt;
}
static int LengthofLoop(Node head){
Node slow=head;
Node fast=head;
while(fast!=null && fast.next!=null){
 slow=slow.next;
 fast=fast.next.next;
if(slow==fast){

return findLength(slow,fast);
}
}
return 0;
}

public static void main(String[] args){
Node head=new Node(1);
Node second=new Node(2);
Node third=new Node(3);
Node fourth=new Node(4);
Node fifth=new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = second;
        int length = LengthofLoop(head);
        if (length > 0) {
            System.out.println("Length of loop: " + length);
        } else {
            System.out.println("Loop does not exist ");
        }


}
}
