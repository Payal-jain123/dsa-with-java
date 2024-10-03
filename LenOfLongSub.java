import java.util.HashMap;//sliding window
class LenOfLongSub{
static int solve(String s){
HashMap<Character,Integer> mpp = new HashMap<>();
int l=0,r=0,maxLen=0;
int n=s.length();
while(r<n){
if(mpp.containsKey(s.charAt(r)) && mpp.get(s.charAt(r))>=l){
l=mpp.get(s.charAt(r))+1;
}

maxLen=Math.max(maxLen,r-l+1);
mpp.put(s.charAt(r),r);
r++;
}
return maxLen;
}
public static void main(String[] args){
String s="takeuforward";
int answer=solve(s);
System.out.println("Length Of Longest Substring is : " + answer);
}
}