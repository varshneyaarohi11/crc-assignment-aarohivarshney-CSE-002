import java.util.*;
class A41{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++) arr[i]=s.nextInt();
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(arr[i]==arr[j]){
for(int k=j;k<n-1;k++) arr[k]=arr[k+1];
n--;
j--;
}
}
}
for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
}
}