import java.util.*;
class A72{
static int sum(int n){
if(n==0) return 0;
return n+sum(n-1);
}
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(sum(n));
}
}