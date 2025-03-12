import java.util.*;
class LongSubString01{
static int solve(String s){
int n=s.length();
int maxLen=0;
for(int i=0;i<n;i++){
HashMap<Character> hash=new HashMap<>();
for(int j=0;j<n;j++){
if(hash[s[j]]==1)
break;
int len=j-i+1;
maxLen=Math.max(len,maxLen);
hash[s[j]]=1;
}
}
return maxLen;
}
public static void main(String[] args){
String s="PayalJain";
System.out.println("ans is:" +solve(s));
}
}
