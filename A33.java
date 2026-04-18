
import java.util.*;
class A33{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=0;i<n;i++){
int num=1;
for(int j=0;j<=i;j++){
System.out.print(num+" ");
num=num*(i-j)/(j+1);
}
System.out.println();
}
}
}