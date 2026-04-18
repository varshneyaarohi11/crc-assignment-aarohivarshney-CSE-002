import java.util.*;
class A14{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int y=s.nextInt();
if((y%4==0 && y%100!=0) || y%400==0) System.out.println("Leap");
else System.out.println("Not Leap");
}
}
