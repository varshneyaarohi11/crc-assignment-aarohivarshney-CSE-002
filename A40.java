import java.util.*;
class A40{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++) arr[i]=s.nextInt();
int pos=s.nextInt();
for(int i=pos;i<n-1;i++) arr[i]=arr[i+1];
for(int i=0;i<n-1;i++) System.out.print(arr[i]+" ");
}
}