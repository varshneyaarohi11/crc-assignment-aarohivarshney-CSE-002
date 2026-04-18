class Node{
int d;
Node next;
Node(int d){this.d=d;}
}
class A78{
static Node top=null;
static void push(int v){
Node n=new Node(v);
n.next=top;
top=n;
}
static void pop(){
if(top!=null) System.out.println(top.d);
top=top.next;
}
public static void main(String a[]){
push(10);push(20);
pop();
}
}