import java.util.*;
class A54{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
String str=s.next();
int len=0;
for(char c:str.toCharArray()) len++;
System.out.println(len);
}
}