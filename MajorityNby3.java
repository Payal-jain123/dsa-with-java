import java.util.*;
class MajorityNby3{
public static List<Integer> majority(int[] arr){
int n=arr.length;
int cnt1=0,cnt2=0;
int ele1=Integer.MIN_VALUE;
int ele2=Integer.MIN_VALUE;
for(int i=0;i<n;i++){
if(cnt1==0 && ele2!=arr[i]){
cnt1=1;
ele1=arr[i];
}
else if(cnt2==0 && ele1!=arr[i]){
cnt2=1;
ele2=arr[i];
}
else if(arr[i]==ele1){
cnt1++;
}
else if(arr[i]==ele2){
cnt2++;
}
else{
cnt1--;
cnt2--;
}
}
List<Integer> ls=new ArrayList<>();
cnt1=0;
cnt2=0;
for(int i=0; i<n ;i++){
if(arr[i]==ele1)
cnt1++;
if(arr[i]==ele2)
cnt2++;
}
int mini=(int) (n/3)+1;
if(cnt1>=mini)
ls.add(ele1);
if(cnt2>=mini)
ls.add(ele2);

return ls;
}
public static void main(String[] args){
int []arr={11,33,33,11,33,11};
List<Integer> ans=majority(arr);
for(int i=0;i<ans.size();i++){
System.out.println(ans.get(i)+ " ");
}
System.out.println();
}
}


