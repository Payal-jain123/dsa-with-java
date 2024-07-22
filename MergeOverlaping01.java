import java.util.*;
class MergeOverlaping01{
public static List<List<Integer>> mergeOptimal(int[] [] arr){
int n=arr.length;
Arrays.sort(arr,new Comparator <int[]> (){
public int compare(int[] a,int[] b){
return a[0]-b[0];
}
}
);
List<List<Integer>> ans =new ArrayList<>();
for(int i=0;i< n;i++){
if(ans.isEmpty() || arr[i][0] > ans.get(ans.size()-1).get(1)){
ans.add(Arrays.asList(arr[i][0],arr[i][1]));
}
else{
ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),arr[i][1]));
}
}
return ans;
}
public static void main(String[]args){
int[][] arr={{1,3},{2,6},{3,5},{15, 18},{8,10},{16,17}};
List<List<Integer>> ans=mergeOptimal(arr);
for(List<Integer> it: ans){
System.out.print(it);
}
System.out.println();
}
}