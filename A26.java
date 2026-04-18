import java.util.*;
class A26{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),r=0,d;
while(n>0){
d=n%10;
r=r*10+d;
n=n/10;
}
System.out.println(r);
}
}