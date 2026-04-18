import java.util.*;
class A70{
static void rev(String str){
if(str.length()==0) return;
rev(str.substring(1));
System.out.print(str.charAt(0));
}
public static void main(String a[]){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
rev(str);
}
}