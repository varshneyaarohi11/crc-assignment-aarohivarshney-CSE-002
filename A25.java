import java.util.*;
class A25{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),t=n,sum=0,d;
while(n>0){
d=n%10;
int f=1;
for(int i=1;i<=d;i++) f=f*i;
sum=sum+f;
n=n/10;
}
if(sum==t) System.out.println("Strong");
else System.out.println("Not");
}
}
