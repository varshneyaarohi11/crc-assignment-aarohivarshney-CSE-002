import java.util.*;
class A67{
static int fact(int n){
if(n==0) return 1;
return n*fact(n-1);
}
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(fact(n));
}
}