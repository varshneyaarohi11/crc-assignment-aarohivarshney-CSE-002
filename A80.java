import java.util.*;
class A80{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),k=s.nextInt();
if((n&(1<<k))!=0) System.out.println("Set");
else System.out.println("Not");
}
}