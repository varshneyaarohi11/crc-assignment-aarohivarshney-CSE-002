import java.util.*;
class A11{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int d=s.nextInt();
int y=d/365;
int w=(d%365)/7;
int r=(d%365)%7;
System.out.println(y+" "+w+" "+r);
}
}
