import java.util.HashMap;

public class LongSubKChr {
    static int solve(String s, int k) {
        int maxLen = 0, l = 0, r = 0;
        HashMap<Character, Integer> mpp = new HashMap<>();
        int n = s.length();

        while (r < n) {
            mpp.put(s.charAt(r), mpp.getOrDefault(s.charAt(r), 0) + 1);

            if (mpp.size() > k) {
                mpp.put(s.charAt(l), mpp.get(s.charAt(l)) - 1);
                if (mpp.get(s.charAt(l)) == 0) {
                    mpp.remove(s.charAt(l));
                }
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "aaabbccd";
        int k = 2;
        System.out.println("Longest substring with at most " + k + " distinct characters: " + solve(s, k));
    }
}