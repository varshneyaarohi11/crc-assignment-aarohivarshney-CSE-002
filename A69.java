import java.util.*;
class A69{
static void toh(int n,char s,char d,char h){
if(n==1){
System.out.println(s+"->"+d);
return;
}
toh(n-1,s,h,d);
System.out.println(s+"->"+d);
toh(n-1,h,d,s);
}
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
toh(n,'A','C','B');
}
}