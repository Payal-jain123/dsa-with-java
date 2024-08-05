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
class DeleteKeyDLL{
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

static Node deleteAllOccurrences(Node head,int key){
Node temp=head;
while(temp!=null){
if(temp.data==key){
if(temp==head){
head=head.next;
}
Node nextNode=temp.next;
Node prevNode=temp.back;
if(nextNode!=null){
nextNode.back=prevNode;
}
if(prevNode!=null){
prevNode.next=nextNode;
}
temp=nextNode;
}
else{
temp=temp.next;
}
}
return  head;

}
static void printDLL(Node head){
while(head!=null){
System.out.print(head.data + " ");
head=head.next;
}
System.out.println();
}
public static void main(String [] args){
int[] arr={4,2,10,4,10,10,6};
int key=10;
Node head=convertArr2DLL(arr);
        System.out.println("Actual DLL is: ");
        printDLL(head);

        head = deleteAllOccurrences(head, key);
        System.out.println("DLL after deleting all occurrences of " + key + ": ");
        printDLL(head);
    }
}