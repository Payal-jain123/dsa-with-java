import java.util.ArrayList;
public class PrintAllSubsecuences {
    public static void printSub(int ind,int arr[],ArrayList<Integer>list){
        int n=arr.length;
        if(ind>=n){
            System.out.println(list);
            return;
        }
        list.add(arr[ind]);
        printSub(ind+1,arr,list);
        list.remove(list.size()-1);
        printSub(ind+1,arr,list);
    }
    public static void main(String[] args){
        int arr[]={3,1,2};
        ArrayList<Integer>list=new ArrayList<>();
        printSub(0,arr,list);
    }
}