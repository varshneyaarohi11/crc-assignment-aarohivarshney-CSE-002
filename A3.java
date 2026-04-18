import java.util.*;
class A3{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int x=s.nextInt(),y=s.nextInt(),temp;
temp=x;
x=y;
y=temp;
System.out.println(x+" "+y);
}
}
