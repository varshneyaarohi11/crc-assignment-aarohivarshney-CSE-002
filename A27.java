import java.util.*;
class A27{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),sum=0,d;
while(n>0){
d=n%10;
sum=sum+d;
n=n/10;
}
System.out.println(sum);
}
}
