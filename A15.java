import java.util.*;
class A15{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
char c=s.next().charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
System.out.println("Vowel");
else System.out.println("Consonant");
}
}
