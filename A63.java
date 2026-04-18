import java.util.*;
class A63{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
String str=s.nextLine(),res="";
for(int i=0;i<str.length();i++){
char ch=str.charAt(i);
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) res+=ch;
}
System.out.println(res);
}
}