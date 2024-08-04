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
class StrtingLoopLL{
static Node startingLoop(Node head){
Node slow=head;
Node fast=head;
while(fast!=null && fast.next!=null){
 slow=slow.next;
 fast=fast.next.next;
if(slow==fast){
slow =head;
while(slow!=fast){
slow=slow.next;
fast=fast.next;
}
return slow;
}
}
return null;
}

public static void main(String[] args){
Node head=new Node(1);
Node second=new Node(2);
Node third=new Node(3);
Node fourth=new Node(4);
Node fifth=new Node(5);
Node sixth=new Node(6);
Node seven=new Node(7);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
sixth.next=seven;
seven.next=fifth;//loop exist
//seven.next=null;//loop not exist
        Node loopStartNode = startingLoop(head);

System.out.print(loopStartNode.data);
}
}



