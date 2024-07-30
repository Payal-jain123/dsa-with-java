class Node{
int data;
Node next;
Node(int data1 , Node next1){
this.data=data1;
this.next=next1;
}
Node(int data1){
this.data=data1;
this.next=null;
}
}

public  class InsertNodeK{
 static Node convertArr2LL(int[] arr){
Node head=new Node(arr[0]);
Node mover=head;
for(int i=1;i<arr.length;i++){
Node temp=new Node(arr[i]);
mover.next=temp;
mover=temp;
}
return head;
}
static Node insertK(Node head,int val,int k){
if(head==null){
if(k==1){
return new Node(val);
}
else{
return head;
}
}
if(k==1){
Node temp=new Node(val,head);
return temp;
}
int cnt=0;
Node temp=head;
while(temp!=null){
cnt++;

if(cnt==(k-1)){
Node x=new Node(val,temp.next);
temp.next=x;
break;
}
temp=temp.next;
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
public static void main(String[] args){
int[] arr={2,5,8,7};
Node head=convertArr2LL(arr);
head=insertK(head,100,3);
printLL(head);
}}