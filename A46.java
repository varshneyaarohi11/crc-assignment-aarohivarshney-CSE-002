import java.util.*;
class A46{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++) arr[i]=s.nextInt();
for(int i=0;i<n-1;i++){
for(int j=0;j<n-1-i;j++){
if(arr[j]>arr[j+1]){
int t=arr[j];
arr[j]=arr[j+1];
arr[j+1]=t;
}
}
}
for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
}
}