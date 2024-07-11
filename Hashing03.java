import java.util.*;
class Hashing03{
public static int hash(char c,String[] s){
int cnt=0;
int n=s.length;
for(String str:s){
for(char ch :str.toCharArray()){
if(ch==c)
cnt+=1;
}
}
return cnt;
}
public static void main(String[] args){
String []s={"a","c","e","a","b","c"};
char c='f';
int cnt=hash(c,s);
System.out.println("answer is:" +cnt);
}
}