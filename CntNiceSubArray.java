public class CntNiceSubArray {
        static int solve(int[] arr, int goal) {
            int n = arr.length;
            if (goal < 0) {
                return 0;
            }
            int l = 0, r = 0, sum = 0, cnt = 0;
            while (r < n) { // Changed the condition to r < n
                sum = 0; // Reset sum to 0 for each iteration
                sum += arr[r]%2;
                while (sum > goal && l <= r) {
                    sum -= arr[l]%2;
                    l++;
                }
                cnt += (r - l + 1);
                r++;
            }
            return cnt; // Return the correct count of subarrays
        }

        public static void main(String[] args) {
            int[] arr = {1, 0, 0, 1, 1, 0};
            int goal = 2;
            int ans = solve(arr, goal);
            System.out.println("Answer is : " + ans);
        }
    }

