import java.util.Arrays;

public class AssignCookiesGreedy {
    static int assign(int greedy[] , int cookies[]){
        int n=greedy.length;
        int m= cookies.length;
        Arrays.sort(greedy);
        Arrays.sort(cookies);
        int l=0,r=0;
        while(l<m && r<n){
            if(greedy[r] <= cookies[l]){
                r++;
            }
            l++;
        }
        return r;

    }
    public static void main(String[] args){
        int []greedy={1,5,3,3,4};
        int[] cookies={4,2,1,2,1,3};
        int cookiesAssignToGreedyFactor=assign(greedy,cookies);
        System.out.println("The Number of children assign the cookies are : " + cookiesAssignToGreedyFactor);
    }
}
