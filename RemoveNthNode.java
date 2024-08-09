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
class RemoveNthNode{
    static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
static Node dltNodeNth(Node head,int N){
Node fast=head;
Node slow=head;
for(int i=0;i<N;i++){
fast=fast.next;
}
if(fast==null){
return head.next;
}
while(fast.next!=null){
slow=slow.next;
fast=fast.next;
}
Node delNode=slow.next;
slow.next=slow.next.next;
delNode=null;
return head;
}
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
public static void main(String[]args){
int[] arr={1,2,4,5,6};
int N=3;
Node head=convertArr2LL(arr);
Node ans=dltNodeNth(head,N);
printLL(ans);
}
}

