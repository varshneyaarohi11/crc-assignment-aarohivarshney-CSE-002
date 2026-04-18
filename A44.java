import java.util.*;
class A44{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++) arr[i]=s.nextInt();
int key=s.nextInt(),pos=-1;
for(int i=0;i<n;i++){
if(arr[i]==key){ pos=i; break; }
}
System.out.println(pos);
}
}
