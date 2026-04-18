import java.util.*;
class A82{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),c=0;
while(n>0){
c+=n&1;
n>>=1;
}
System.out.println(c);
}
}