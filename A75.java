class A75{
class N{int d;N p,n;N(int d){this.d=d;}}
N h;

void ib(int d){
N x=new N(d);
if(h!=null){h.p=x;x.n=h;}
h=x;
}

void ie(int d){
N x=new N(d);
if(h==null){h=x;return;}
N t=h;
while(t.n!=null)t=t.n;
t.n=x;x.p=t;
}

void ds(){
N t=h;
while(t!=null){System.out.print(t.d+" ");t=t.n;}
System.out.println();
}

public static void main(String a[]){
A75 l=new A75();
l.ib(1);l.ib(2);l.ie(3);l.ie(4);
l.ds();
}
}