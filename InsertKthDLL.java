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
class InsertKthDLL{
static Node convertArr2DLL(int[]arr){
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
static void printDLL(Node head){
while(head!=null){
System.out.print(head.data + " ");
head=head.next;
}
}
static Node insertHead(Node head,int val){
Node newHead=new Node(val,head,null);
head.back=newHead;
return newHead;
}

static Node insertKth(Node head, int k,int val) {
    if (k == 1) {
     return insertHead(head,val);
    }
    Node temp = head;
int cnt=0;
    while (temp !=null){
cnt++;
if(cnt==k) break;
        temp=temp.next;
    }
Node prev=temp.back;
    Node newNode = new Node(val, temp,prev);
    prev.next=newNode;
temp.back=newNode;
    return head;
}
public static void main(String[] args){
int[] arr={21,34,67,45,98};
Node head=convertArr2DLL(arr);
head=insertKth(head,4,7);
printDLL(head);
}
}



