import java.util.*;
class A28{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int x=s.nextInt(),y=s.nextInt(),g=1;
for(int i=1;i<=x&&i<=y;i++){
if(x%i==0 && y%i==0) g=i;
}
int l=(x*y)/g;
System.out.println(g);
System.out.println(l);
}
}