import java.util.*;
class A61{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String low="",up="";
for(int i=0;i<str.length();i++){
char ch=str.charAt(i);
if(ch>='A'&&ch<='Z') low+=(char)(ch+32);
else low+=ch;
if(ch>='a'&&ch<='z') up+=(char)(ch-32);
else up+=ch;
}
System.out.println(low);
System.out.println(up);
}
}