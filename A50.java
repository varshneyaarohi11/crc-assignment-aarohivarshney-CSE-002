import java.util.*;
class A50{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int r=s.nextInt(),c=s.nextInt();
int arr[][]=new int[r][c];
for(int i=0;i<r;i++)
for(int j=0;j<c;j++) arr[i][j]=s.nextInt();
for(int i=0;i<c;i++){
for(int j=0;j<r;j++) System.out.print(arr[j][i]+" ");
System.out.println();
}
}
}
