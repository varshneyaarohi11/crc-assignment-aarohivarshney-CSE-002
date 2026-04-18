import java.util.*;
class A39{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n+1];
for(int i=0;i<n;i++) arr[i]=s.nextInt();
int pos=s.nextInt(),val=s.nextInt();
for(int i=n;i>pos;i--) arr[i]=arr[i-1];
arr[pos]=val;
for(int i=0;i<=n;i++) System.out.print(arr[i]+" ");
}
}
