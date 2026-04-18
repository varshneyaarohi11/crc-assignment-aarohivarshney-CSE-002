import java.util.*;
class A81{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),k=s.nextInt();
n=n^(1<<k);
System.out.println(n);
}
}