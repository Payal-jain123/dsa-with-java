import java.util.*;

public class NinjaTrainingSpace {

        // Function to find the maximum points for ninja training
        static int ninjaTraining(int n, int[][] points) {
            // Initialize an array 'prev' to store the maximum points for the previous day
            int prev[] = new int[4];

            // Initialize the first day's maximum points based on the available choices
            prev[0] = Math.max(points[0][1], points[0][2]);
            prev[1] = Math.max(points[0][0], points[0][2]);
            prev[2] = Math.max(points[0][0], points[0][1]);
            prev[3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));

            // Iterate through each day starting from the second day
            for (int day = 1; day < n; day++) {
                // Initialize an array 'temp' to store the maximum points for the current day
                int temp[] = new int[4];
                for (int last = 0; last < 4; last++) {
                    temp[last] = 0; // Initialize the maximum points for the current day and last activity
                    // Consider each possible task for the current day
                    for (int task = 0; task <= 2; task++) {
                        if (task != last) { // Ensure that the current task is different from the last
                            // Calculate the points for the current activity and add it to the maximum points from the previous day
                            temp[last] = Math.max(temp[last], points[day][task] + prev[task]);
                        }
                    }
                }
                // Update 'prev' to store the maximum points for the current day
                prev = temp;
            }

            // Return the maximum points achievable after all days (last activity is 3)
            return prev[3];
        }

        public static void main(String args[]) {
            // Define the points for each activity on each day
            int[][] points = {{10, 40, 70},
                    {20, 50, 80},
                    {30, 60, 90}};

            int n = points.length; // Get the number of days
            System.out.println(ninjaTraining(n, points)); // Calculate and print the maximum points
        }
    }



