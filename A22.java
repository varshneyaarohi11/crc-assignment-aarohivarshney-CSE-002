import java.util.*;
class A22{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=2;i<=n;i++){
int c=0;
for(int j=1;j<=i;j++){
if(i%j==0) c++;
}
if(c==2) System.out.print(i+" ");
}
}
}