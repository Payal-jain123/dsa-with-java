import java.util.*;

class SetMaxZeros {
    public static void markRow(int[][] matrix, int m, int n, int i) {
        for (int j = 0; j < m; j++) {
            if (matrix[i][j]!= 0) {
                matrix[i][j] = -1;
            }
        }
    }

    public static void markCol(int[][] matrix, int m, int n, int j) {
        for (int i = 0; i < n; i++) {
            if (matrix[i][j]!= 0) {
                matrix[i][j] = -1;
            }
        }
    }

    public static int[][] zeroMatrix(int[][] matrix, int m, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    markRow(matrix, m, n, i);
                    markCol(matrix, m, n, j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 1, 0, 0},
                {1, 1, 1, 1, 1},
                {1, 0, 1, 0, 0},
                {1, 1, 1, 1, 1}
        };
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] ans = zeroMatrix(matrix, m, n);
        System.out.println("The final matrix is:");
        for (int[] row : ans) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}