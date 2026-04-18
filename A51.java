import java.util.*;
class A51{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[][]=new int[n][n];
for(int i=0;i<n;i++)
for(int j=0;j<n;j++) arr[i][j]=s.nextInt();
int flag=1;
for(int i=0;i<n;i++)
for(int j=0;j<n;j++)
if(arr[i][j]!=arr[j][i]) flag=0;
if(flag==1) System.out.println("Symmetric");
else System.out.println("Not");
}
}