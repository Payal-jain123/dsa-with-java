import java.util.*;
class Median{
public static double median(int[] a,int[] b){
int n1=a.length;
int n2=b.length;
List<Integer> ans =new ArrayList<>();
int i=0 ,j=0;
while(i<n1 && j<n2){
if(a[i]<b[j]){
ans.add(a[i++]);
}
else{
ans.add(b[j++]);
}
}
while(i<n1){
ans.add(a[i++]);
}
while(j<n2){
ans.add(b[j++]);
}
int n=n1+n2;
if(n%2==1){
return (double)ans.get(n/2);
}
else{
double median = ((double) ans.get(n / 2) + (double) ans.get((n / 2) - 1)) / 2.0;
return median;
}
}
public static void main(String [] args){
int[] a={1,4,7};
int b[]={2,3,6,15};
System.out.println(median (a,b));
}
}
