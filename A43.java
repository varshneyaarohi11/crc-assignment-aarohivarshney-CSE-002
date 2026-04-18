import java.util.*;
class A43{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),k=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++) arr[i]=s.nextInt();
for(int r=1;r<=k;r++){
int last=arr[n-1];
for(int i=n-1;i>0;i--) arr[i]=arr[i-1];
arr[0]=last;
}
for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
}
}