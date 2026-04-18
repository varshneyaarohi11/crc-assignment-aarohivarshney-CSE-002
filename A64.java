import java.util.*;
class A64{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
int freq[]=new int[256];
for(int i=0;i<str.length();i++){
freq[str.charAt(i)]++;
}
for(int i=0;i<256;i++){
if(freq[i]>0) System.out.println((char)i+" "+freq[i]);
}
}
}