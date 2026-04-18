import java.util.*;
class A58{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
String str=s.next(),rev="";
for(int i=str.length()-1;i>=0;i--) rev+=str.charAt(i);
System.out.println(rev);
}
}