public class N0OfSub3ChrOptimal {
    static int solve(String s){
        int n=s.length();
        int[] lastSeen = new int[n];
        for(int i=0; i<n; i++)
             lastSeen[i] = -1;
        int a=-1,b=-1,c=-1;
        int cnt=0;
        for(int i=0;i<n;i++){
            lastSeen[s.charAt(i)-'a'] = i;
            if(lastSeen[0]!=-1 && lastSeen[1]!=-1 && lastSeen[2]!=-1){
                int min = Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]));
                cnt += (n - min);
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        String s = "bbacba";
        int ans = solve(s);
        System.out.println("Answer is : " + ans);
    }
}