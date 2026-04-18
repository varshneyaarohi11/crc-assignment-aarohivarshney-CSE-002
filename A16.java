import java.util.*;
class A16{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
double x=s.nextDouble(),y=s.nextDouble(),z=s.nextDouble();
double d=y*y-4*x*z;
if(d>0){
double r1=(-y+Math.sqrt(d))/(2*x);
double r2=(-y-Math.sqrt(d))/(2*x);
System.out.println(r1+" "+r2);
}
else if(d==0){
double r=-y/(2*x);
System.out.println(r);
}
else System.out.println("Imaginary");
}
}
