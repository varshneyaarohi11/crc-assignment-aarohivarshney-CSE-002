import java.util.*;
class A60{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
int v=0,c=0,d=0,sp=0;
for(int i=0;i<str.length();i++){
char ch=str.charAt(i);
if(Character.isDigit(ch)) d++;
else if(ch==' ') sp++;
else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
if("aeiouAEIOU".indexOf(ch)!=-1) v++;
else c++;
}
}
System.out.println(v+" "+c+" "+d+" "+sp);
}
}