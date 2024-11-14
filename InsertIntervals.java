import java.util.*;

class InsertIntervals {
    public List<int[]> insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        int i = 0, n = intervals.length;

        // Add all intervals that come before the new interval
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // Merge all overlapping intervals with the new interval
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        // Add the merged new interval
        result.add(newInterval);

        // Add remaining intervals after the new interval
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        InsertIntervals solution = new InsertIntervals();

        // Example intervals and the new interval
        int[][] intervals = {{1, 2}, {3,4},{5,7},{8,10},{12,16}};
        int[] newInterval = {6, 8};

        List<int[]> result = solution.insert(intervals, newInterval);

        // Print the result
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
 