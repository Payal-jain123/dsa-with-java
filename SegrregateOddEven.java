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
class SegrregateOddEven{
static Node convertArr2LL(int[]arr){
Node head=new Node(arr[0]);
Node mover=head;
for(int i=1;i<arr.length;i++){
Node temp=new Node(arr[i]);
mover.next=temp;
mover=mover.next;
}
return head;
}
    static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

static Node oddAndeven(Node head){
if(head==null ||head.next==null){
return head;
}
Node odd=head;
Node even=head.next;
Node evenHead=head.next;
while(even!=null && even.next!=null){
odd.next=odd.next.next;
even.next=even.next.next;
odd=odd.next;
even=even.next;
}
odd.next=evenHead;
return head;
}
public static void main(String[]args){
int[] arr={1,2,3,4,5,6};
Node head=convertArr2LL(arr);
Node ans=oddAndeven(head);
printLL(ans);
}
}