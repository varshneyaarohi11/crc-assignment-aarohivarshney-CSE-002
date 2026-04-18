import java.util.*;
class A36{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),sum=0;
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=s.nextInt();
sum+=arr[i];
}
System.out.println(sum);
System.out.println((float)sum/n);
}
}