import java.util.*;
class A34{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),num=1;
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print(num+" ");
num++;
}
System.out.println();
}
}
}
