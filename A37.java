import java.util.*;
class A37{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++) arr[i]=s.nextInt();
int max=arr[0],min=arr[0];
for(int i=1;i<n;i++){
if(arr[i]>max) max=arr[i];
if(arr[i]<min) min=arr[i];
}
System.out.println(max);
System.out.println(min);
}
}