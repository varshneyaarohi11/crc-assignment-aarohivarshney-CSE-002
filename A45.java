import java.util.*;
class A45{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++) arr[i]=s.nextInt();
int key=s.nextInt();
int l=0,h=n-1,mid,pos=-1;
while(l<=h){
mid=(l+h)/2;
if(arr[mid]==key){ pos=mid; break; }
else if(arr[mid]<key) l=mid+1;
else h=mid-1;
}
System.out.println(pos);
}
}