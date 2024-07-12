import java.util.*;
class Hashing04{
public static void main(String[] args){
System.out.println("Enter a string");
Scanner sc=new Scanner(System.in);
String s;
s=sc.next();

int[] hash=new int[26];
for(int i=0;i<s.length();i++){
hash[s.charAt(i)-'a']+=1;
}
int q;
System.out.println("Enter the Size we found:");
q=sc.nextInt();
while(q--!=0){
char c;
System.out.println("enter characters:");
c=sc.next().charAt(0);
System.out.println(hash[c-'a']);
}
}
}