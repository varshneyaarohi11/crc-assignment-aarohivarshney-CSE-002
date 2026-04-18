import java.util.*;
class A17{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int x=s.nextInt(),y=s.nextInt();
char op=s.next().charAt(0);
switch(op){
case '+': System.out.println(x+y); break;
case '-': System.out.println(x-y); break;
case '*': System.out.println(x*y); break;
case '/': System.out.println(x/y); break;
default: System.out.println("Invalid");
}
}
}