public class Candy {
    static int candies(int[] ratings,int n){
        int sum=1;
        int i=1;
        while(i<n){
            if(ratings[i]==ratings[i-1]){
                sum+=1;
                i++;
                continue;
            }
            int peak=1;
            while(i<n && ratings[i]>ratings[i-1]){
                peak+=1;
                sum+=peak;
                i++;
            }
            int down=0;
            while(i<n && ratings[i]<ratings[i-1]){
                sum+=down;
                i++;
                down++;
            }
            if(down>peak){
                sum+=down-peak;
            }
            }
        return sum;
    }
    public static void main(String [] args){
        int[] ratings={0,2,4,7,6,5,4,3,2,1,1,1,2,3,4,2,1,1,1};
        int n=ratings.length;
        System.out.println(candies(ratings,n));
    }
}
