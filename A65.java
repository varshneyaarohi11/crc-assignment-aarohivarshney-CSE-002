import java.util.*;
class A65{
static boolean isPrime(int n){
int c=0;
for(int i=1;i<=n;i++) if(n%i==0) c++;
return c==2;
}
static boolean isArm(int n){
int t=n,sum=0,d;
while(n>0){
d=n%10;
sum+=d*d*d;
n/=10;
}
return sum==t;
}
static boolean isPerfect(int n){
int sum=0;
for(int i=1;i<n;i++) if(n%i==0) sum+=i;
return sum==n;
}
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(isPrime(n));
System.out.println(isArm(n));
System.out.println(isPerfect(n));
}
}
