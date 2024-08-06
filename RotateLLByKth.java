class Node {
    int data;      
    Node next;     
    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }
    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}
class RotateLLByKth{
public static Node convertArr2LL(int[] arr){
Node head=new Node(arr[0]);
Node mover=head;
for(int i=1;i<arr.length;i++){
Node temp=new Node(arr[i]);
mover.next=temp;
mover=mover.next;
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
static Node findNthNode(Node temp,int k){
int cnt=1;
while(temp!=null){
if(cnt==k)
return temp;
cnt++;
temp=temp.next;
}
return null;
}
static Node rotateLL(Node head,int k){
if (head == null || head.next == null)
  return head;
int len=1;
Node tail=head;
while(tail.next!=null){
len++;
tail=tail.next;
}
if(k%len==0)
return head;
k=k%len;
tail.next=head;
Node newTail=findNthNode(head,len-k);
head=newTail.next;
newTail.next=null;
return head;
}
public static void main(String[] args){
int[] arr={1,2,3,4,5};
int k=3;//rotation is depend on it
        Node head = convertArr2LL(arr);

System.out.println("Before Rotation the LinkList is  : ");
        printLL(head);
 head=rotateLL(head,k);
System.out.println("After Rotation the LinkList is  : ");
        printLL(head);
}
}
