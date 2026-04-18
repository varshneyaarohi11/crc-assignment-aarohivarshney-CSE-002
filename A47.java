import java.util.*;
class A47{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++) arr[i]=s.nextInt();
for(int i=0;i<n-1;i++){
int min=i;
for(int j=i+1;j<n;j++){
if(arr[j]<arr[min]) min=j;
}
int t=arr[i];
arr[i]=arr[min];
arr[min]=t;
}
for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
}
}