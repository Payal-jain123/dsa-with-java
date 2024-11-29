//Space Optimization
import java.util.*;
public class FibonacciDP3 {
    public static void main(String[] args){
        int n=5;
        int prev2=0;
        int prev=1;
        for(int i=2;i<=n;i++){
            int curr_i=prev2+prev;
            prev2=prev;
            prev=curr_i;

        }
        System.out.println("The last fibonacci no. is : " +prev);
    }

}
