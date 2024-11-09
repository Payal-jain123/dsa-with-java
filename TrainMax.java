import java.util.Arrays;

public class TrainMax {
    static int findPlatform(int[] arr, int[] dep, int n) {
        // Sort the arrival and departure times
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i = 0, j = 0, cnt = 0, maxCnt = 0;
        
        // Process both arrival and departure times
        while (i < n) {  // Fix: loop should stop when i reaches n (not n+1)
            // If the train arrives before or when the last train departs, increase the platform count
            if (arr[i] <= dep[j]) {
                cnt++;
                i++;
            } else {
                // If the train departs before the next train arrives, decrease the platform count
                cnt--;
                j++;
            }
            
            // Update the maximum platform count
            maxCnt = Math.max(maxCnt, cnt);
        }
        
        return maxCnt;
    }

    public static void main(String[] args) {
        // Test data
        int[] arr = {900, 945, 955, 1100, 1500, 1800};
        int[] dep = {920, 1200, 1130, 1150, 1900, 2000};
        int n = arr.length;

        // Find the minimum number of platforms required
        int totalCount = findPlatform(arr, dep, n);
        
        // Output the result
        System.out.println("Minimum number of Platforms required: " + totalCount);
    }
}
