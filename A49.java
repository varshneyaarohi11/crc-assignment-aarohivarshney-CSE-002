import java.util.*;
class A49{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int r1=s.nextInt(),c1=s.nextInt();
int r2=s.nextInt(),c2=s.nextInt();
int x[][]=new int[r1][c1];
int y[][]=new int[r2][c2];
for(int i=0;i<r1;i++)
for(int j=0;j<c1;j++) x[i][j]=s.nextInt();
for(int i=0;i<r2;i++)
for(int j=0;j<c2;j++) y[i][j]=s.nextInt();
int z[][]=new int[r1][c2];
for(int i=0;i<r1;i++)
for(int j=0;j<c2;j++)
for(int k=0;k<c1;k++)
z[i][j]+=x[i][k]*y[k][j];
for(int i=0;i<r1;i++){
for(int j=0;j<c2;j++) System.out.print(z[i][j]+" ");
System.out.println();
}
}
}
