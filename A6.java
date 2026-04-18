import java.util.*;
class A6{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
float p=s.nextFloat(),r=s.nextFloat(),t=s.nextFloat();
float si=(p*r*t)/100;
float ci=(float)(p*Math.pow((1+r/100),t)-p);
System.out.println(si);
System.out.println(ci);
}
}
