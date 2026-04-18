import java.util.*;
class A53{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int r=s.nextInt(),c=s.nextInt();
int x[][]=new int[r][c];
int y[][]=new int[r][c];
for(int i=0;i<r;i++)
for(int j=0;j<c;j++) x[i][j]=s.nextInt();
for(int i=0;i<r;i++)
for(int j=0;j<c;j++) y[i][j]=s.nextInt();
int flag=1;
for(int i=0;i<r;i++)
for(int j=0;j<c;j++)
if(x[i][j]!=y[i][j]) flag=0;
if(flag==1) System.out.println("Equal");
else System.out.println("Not Equal");
}
}