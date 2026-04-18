import java.util.*;
class A18{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
char c=s.next().charAt(0);
if((c>='a'&&c<='z')||(c>='A'&&c<='Z')) System.out.println("Alphabet");
else if(c>='0'&&c<='9') System.out.println("Digit");
else System.out.println("Special");
}
}