class Node{
int d;
Node next;
Node(int d){this.d=d;}
}
class A74{
static Node head=null;
static void insert(int v){
Node n=new Node(v);
if(head==null) head=n;
else{
Node t=head;
while(t.next!=null) t=t.next;
t.next=n;
}
}
static void rev(){
Node p=null,c=head,n;
while(c!=null){
n=c.next;
c.next=p;
p=c;
c=n;
}
head=p;
}
static void display(){
Node t=head;
while(t!=null){
System.out.print(t.d+" ");
t=t.next;
}
}
public static void main(String a[]){
insert(1);insert(2);insert(3);
rev();
display();
}
}