class Node {
int data;
Node next;
Node back;
Node(int data1,Node next1,Node back1)
{
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
class DeleteKthEleDLL{
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
public static void printDLL(Node head){
while(head!=null){
System.out.print(head.data + " ");
head=head.next;
}
}
static Node deleteKele(Node head,int k){
if(head==null){
return null;}
Node temp=head;
int cnt=0;
while(temp!=null){
cnt++;
if(cnt==k)break;
temp=temp.next;
}
if(temp==null){
return head;
}
Node prev=temp.back;
Node front=temp.next;
if(prev==null)
{
head=front;

}else{
prev.next=front;
}
if(front!=null){
front.back=prev;
}
temp.next=null;
temp.back=null;
return head;
}
public static void main(String[] args){
int[] arr={199,9,8,5};
Node head=convertArr2DLL(arr);
head=deleteKele(head,3);
printDLL(head);
}
}


