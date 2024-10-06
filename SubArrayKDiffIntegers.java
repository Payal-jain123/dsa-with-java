import java.util.HashMap;

public class SubArrayKDiffIntegers {
    static int solve(String s, int k) {
        int l = 0, r = 0, cnt = 0;
        int n = s.length();
        HashMap<Character, Integer> mpp = new HashMap<>();

        while (r < n) {
            mpp.put(s.charAt(r), mpp.getOrDefault(s.charAt(r), 0) + 1);

            while (mpp.size() > k) {
                mpp.put(s.charAt(l), mpp.get(s.charAt(l)) - 1);
                if (mpp.get(s.charAt(l)) == 0) {
                    mpp.remove(s.charAt(l));
                }
                l++;
            }

            cnt += (r - l + 1);
            r++;
        }

        return cnt;
    }

    public static void main(String[] args) {
        String s = "baaacdcb";
        int k = 3;
        System.out.println("SubArray with k different Integers " + k + " distinct characters: " + solve(s, k));
    }
} 