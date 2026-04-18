import java.util.*;
class A68{
static int gcd(int x,int y){
if(y==0) return x;
return gcd(y,x%y);
}
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int x=s.nextInt(),y=s.nextInt();
System.out.println(gcd(x,y));
}
}