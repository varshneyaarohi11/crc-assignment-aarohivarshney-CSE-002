import java.util.*;
class A20{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),x=0,y=1,z;
for(int i=1;i<=n;i++){
System.out.print(x+" ");
z=x+y;
x=y;
y=z;
}
}
}
