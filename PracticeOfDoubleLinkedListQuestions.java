//import java.util.Stack;//statck use in reverse DLL only
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
class PracticeOfDoubleLinkedListQuestions{
static Node convertArr2DLL(int[] arr){
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
Node temp=head;
while(head!=null){
System.out.print(head.data + " ");
head=head.next;
}
System.out.println();
}

//delete head in DLL
/*static Node deleteHead(Node head){
if(head==null || head.next==null)
return null;
Node prev=head;
head=head.next;
head.back=null;
prev.next=null;
return head;
}*/
 
//delete tail in DLL
/*static Node deleteTail(Node head){
if(head==null || head.next==null)
return null;
Node tail=head;
while(tail.next!=null){
tail=tail.next;
}
Node prev=tail.back;
prev.next=null;
tail.back=null;
return head;
}*/

//delete  kth postion element in DLL
/*static Node deleteKpos(Node head,int k){
if(head==null){
return null;}
Node temp=head;
int cnt=0;
while(temp!=null){
cnt++;
if(cnt==k)
break;
temp=temp.next;
}
if(temp==null){
return head;
}
Node prev=temp.back;
Node front=temp.next;
if(prev==null){
head=front;
}
else{
prev.next=front;
}
if(front!=null){
front.back=prev;
}
temp.next=null;
temp.back=null;
return head;
}*/

//delete Node present in DLL
/*static void deleteNodeEle(Node temp){
Node prev=temp.back;
Node front=temp.next;
if(front==null){
prev.next=null;
temp.next=null;
}
front.back=prev;
prev.next=front;
temp.next=null;
temp.back=null;
}*/

//insert head before head in DLL
/*static Node insertBeforeHead(Node head,int val){
Node newHead=new Node(val,head,null);
head.back=newHead;
return newHead;
}*/

//insert head after head in DLL
/*static Node insertAfterHead(Node head,int val){
Node newHead=new Node(val,head.next,head);
head.next=newHead;
return head;
}*/

//insert tail before tail in DLL
/*static Node insertBeforetail(Node head,int val){
if(head==null)
return insertBeforetail(head,val);
Node tail=head;
while(tail.next!=null){
tail=tail.next;
}
Node prev=tail.back;
Node newNode=new Node(val,tail,prev);
tail.back=newNode;
prev.next=newNode;
return head;
}*/

//insert tail after tail in DLL
/*static Node insertAftertail(Node head,int val){
if(head==null)
return insertAftertail(head,val);
Node tail=head;
while(tail.next!=null){
tail=tail.next;
}
Node prev=tail;
Node newNode=new Node(val,null,tail);
tail.next=newNode;
newNode.next=null;
return head;
}*/

//insert before kth position
/*static Node insertBeforeKthpos(Node head,int val,int k){
if(k==1)
return insertBeforeHead(head,val);//we use insert head function
Node temp=head;
int cnt=0;
while(temp!=null){
cnt++;
if(cnt==k)
break;
temp=temp.next;
}
Node prev=temp.back;
Node newNode=new Node(val,temp,prev);
prev.next=newNode;
temp.back=newNode;
return head;
}*/

//insert after kth position
/*static Node insertAfterKthpos(Node head,int val,int k){
if(k==1)
return insertAfterHead(head,val);//we use insert head function
Node temp=head;
int cnt=0;
while(temp!=null){
cnt++;
if(cnt==k)
break;
temp=temp.next;
}
Node prev=temp.back;
Node newNode=new Node(val,temp.next,temp);
newNode.back=temp;
temp.next=newNode;
return head;
}*/

//insert node before  given element
/*static void insertbeforeNode(Node node,int val){
Node prev=node.back;
Node newNode=new Node(val,node,prev);
prev.next=newNode;
node.back=newNode;
}*/

//insert node  after given element
/*static void insertbeforeNode(Node node,int val){
Node prev=node.back;
Node newNode=new Node(val,node.next,node);
prev.next=node;
node.next=newNode;
}*/

//Reverse of a DLL brute force
/*static Node reverseDLL(Node head){
    Stack<Integer> st = new Stack<>();

Node temp=head;
while(temp!=null){
st.push(temp.data);
temp=temp.next;
}
temp=head;
while(temp!=null){
temp.data=st.pop();
temp=temp.next;
}
return head;
}*/

//Reverse of a DLL optimal force
/*static Node reverseDLL(Node head){
if(head==null || head.next==null){
return head;
}
Node prev=null;
Node current=head;
while(current!=null){
prev=current.back;
current.back=current.next;
current.next=prev;
current=current.back;
}
return prev.back;
}*/

//Delete all occurences of key
/*static Node deleteOccKey(Node head,int key){
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
return head;
}*/

//remove duplicates from sorted DLL
static Node removeDup(Node head){
Node temp=head;
while(temp!=null && temp.next!=null){
Node nextNode=temp.next;
while(nextNode!= null && nextNode.data==temp.data){
nextNode=nextNode.next;
}
temp.next=nextNode;
if(nextNode!=null){
nextNode.back=temp;
}
temp=temp.next;
}
return head;
}
//main method
public static void main(String[] args){
int []arr={1,1,2,2,2,3,4,5,5,5,6};
//int val=100;//for all insertion
Node head=convertArr2DLL(arr);
//head=deleteHead(head);
//head=deleteTail(head);
//head=deleteKpos(head,4);
//deleteNodeEle(head.next.next);
//head=insertBeforeHead(head,val);
//head=insertAfterHead(head,val);
//head=insertBeforetail(head,val);
//head=insertAftertail(head,val);
//head=insertBeforeKthpos(head,val,3);
//head=insertAfterKthpos(head,val,3);
//insertbeforeNode(head.next.next,val);
//head=reverseDLL(head);
//head=reverseDLL(head);
//head=deleteOccKey(head,12);
head=removeDup(head);
printDLL(head);
}
}