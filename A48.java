import java.util.*;
class A48{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int r=s.nextInt(),c=s.nextInt();
int x[][]=new int[r][c];
int y[][]=new int[r][c];
for(int i=0;i<r;i++)
for(int j=0;j<c;j++) x[i][j]=s.nextInt();
for(int i=0;i<r;i++)
for(int j=0;j<c;j++) y[i][j]=s.nextInt();
int z[][]=new int[r][c];
for(int i=0;i<r;i++)
for(int j=0;j<c;j++) z[i][j]=x[i][j]+y[i][j];
for(int i=0;i<r;i++){
for(int j=0;j<c;j++) System.out.print(z[i][j]+" ");
System.out.println();
}
}
}