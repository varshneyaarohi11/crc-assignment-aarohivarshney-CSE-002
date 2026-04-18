import java.util.*;
class A13{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int x=s.nextInt(),y=s.nextInt(),z=s.nextInt();
int max=x;
if(y>max) max=y;
if(z>max) max=z;
System.out.println(max);
}
}
