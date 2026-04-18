import java.util.*;
class A24{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),t=n,sum=0,d;
while(n>0){
d=n%10;
sum=sum+d*d*d;
n=n/10;
}
if(sum==t) System.out.println("Armstrong");
else System.out.println("Not");
}
}