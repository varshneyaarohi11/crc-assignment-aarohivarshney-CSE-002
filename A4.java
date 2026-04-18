import java.util.*;
class A4{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int x=s.nextInt(),y=s.nextInt();
x=x+y;
y=x-y;
x=x-y;
System.out.println(x+" "+y);
}
}