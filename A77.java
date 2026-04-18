class A77{
int m=5,f=-1,r=-1;
int[] q=new int[m];

void en(int d){
if(r==m-1)return;
if(f==-1)f=0;
q[++r]=d;
}

void de(){
if(f==-1||f>r)return;
f++;
}

void ds(){
if(f==-1||f>r)return;
for(int i=f;i<=r;i++)System.out.print(q[i]+" ");
System.out.println();
}

public static void main(String a[]){
A77 x=new A77();
x.en(1);x.en(2);x.en(3);
x.ds();
x.de();
x.ds();
}
}