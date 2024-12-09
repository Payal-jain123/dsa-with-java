
import java.util.*;

public class MaxfallPathSpace {
        // Function to find the maximum path sum in the matrix using dynamic programming
        static int getMaxPathSum(List<List<Integer>> matrix) {
            int n = matrix.size();
            int m = matrix.get(0).size();

            List<Integer> prev = new ArrayList<>(Collections.nCopies(m, 0));
            List<Integer> cur = new ArrayList<>(Collections.nCopies(m, 0));

            // Initializing the first row - base condition
            for (int j = 0; j < m; j++) {
                prev.set(j, matrix.get(0).get(j));
            }

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int up = matrix.get(i).get(j) + prev.get(j);
                    int leftDiagonal = matrix.get(i).get(j);
                    if (j - 1 >= 0) {
                        leftDiagonal += prev.get(j - 1);
                    } else {
                        leftDiagonal += -1e9;
                    }

                    int rightDiagonal = matrix.get(i).get(j);
                    if (j + 1 < m) {
                        rightDiagonal += prev.get(j + 1);
                    } else {
                        rightDiagonal += -1e9;
                    }

                    // Store the maximum of the three paths in cur
                    cur.set(j, Math.max(up, Math.max(leftDiagonal, rightDiagonal)));
                }

                // Update the prev list with the values from the cur list for the next row
                prev = new ArrayList<>(cur);
            }

            int maxi = Integer.MIN_VALUE;

            for (int j = 0; j < m; j++) {
                maxi = Math.max(maxi, prev.get(j));
            }

            return maxi;
        }

        public static void main(String args[]) {
            List<List<Integer>> matrix = new ArrayList<>();
            matrix.add(Arrays.asList(1, 2, 10, 4));
            matrix.add(Arrays.asList(100, 3, 2, 1));
            matrix.add(Arrays.asList(1, 1, 20, 2));
            matrix.add(Arrays.asList(1, 2, 2, 1));

            // Call the getMaxPathSum function and print the result
            System.out.println(getMaxPathSum(matrix));
        }
    }



