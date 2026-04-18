import java.util.*;
class A71{
static int pow(int x,int n){
if(n==0) return 1;
return x*pow(x,n-1);
}
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int x=s.nextInt(),n=s.nextInt();
System.out.println(pow(x,n));
}
}