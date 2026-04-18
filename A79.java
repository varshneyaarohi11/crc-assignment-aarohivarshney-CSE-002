import java.util.*;
class A79{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
String str=s.next();
Stack<Character> st=new Stack<>();
int flag=1;
for(char c:str.toCharArray()){
if(c=='(') st.push(c);
else if(c==')'){
if(st.isEmpty()) flag=0;
else st.pop();
}
}
if(!st.isEmpty()) flag=0;
if(flag==1) System.out.println("Balanced");
else System.out.println("Not");
}
}