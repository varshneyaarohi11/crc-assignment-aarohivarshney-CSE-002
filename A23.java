import java.util.*;
class A23{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),t=n,r=0,d;
while(n>0){
d=n%10;
r=r*10+d;
n=n/10;
}
if(t==r) System.out.println("Palindrome");
else System.out.println("Not");
}
}
