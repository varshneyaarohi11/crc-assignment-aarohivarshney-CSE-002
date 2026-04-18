import java.util.*;
class A57{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
String s1=s.next(),s2=s.next();
int flag=1;
if(s1.length()!=s2.length()) flag=0;
else{
for(int i=0;i<s1.length();i++){
if(s1.charAt(i)!=s2.charAt(i)) flag=0;
}
}
if(flag==1) System.out.println("Equal");
else System.out.println("Not Equal");
}
}
