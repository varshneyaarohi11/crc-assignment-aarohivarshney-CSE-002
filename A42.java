import java.util.*;
class A42{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),m=s.nextInt();
int a1[]=new int[n],a2[]=new int[m];
for(int i=0;i<n;i++) a1[i]=s.nextInt();
for(int i=0;i<m;i++) a2[i]=s.nextInt();
int res[]=new int[n+m];
for(int i=0;i<n;i++) res[i]=a1[i];
for(int i=0;i<m;i++) res[n+i]=a2[i];
for(int i=0;i<n+m;i++) System.out.print(res[i]+" ");
}
}
