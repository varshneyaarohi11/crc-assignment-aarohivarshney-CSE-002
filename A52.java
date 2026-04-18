import java.util.*;
class A52{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),sum=0;
int arr[][]=new int[n][n];
for(int i=0;i<n;i++)
for(int j=0;j<n;j++) arr[i][j]=s.nextInt();
for(int i=0;i<n;i++) sum+=arr[i][i];
for(int i=0;i<n;i++) sum+=arr[i][n-1-i];
System.out.println(sum);
}
}