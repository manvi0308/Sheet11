public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int rowCount = matrix.length;
        int colCount = matrix[0].length;

        boolean firstRowZero = false, firstColZero = false;

        // Iterate over the first row and first col
        // if any of the values is zero, then set
        // the corresponding variables to true

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (matrix[i][0] == 0) {
                    firstColZero = true;
                    break;
                }
            }
        }
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (matrix[0][j] == 0) {
                    firstRowZero = true;
                    break;
                }
            }
        }

        // ToDo Iterate over other values of matrix
        for (int i = 1; i < rowCount; i++) {
            for (int j = 1; j < colCount; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = -1;
                    matrix[i][j] = -1;
                }
            }
        }

        for (int i = 1; i < rowCount; i++) {
            for (int j = 1; j < colCount; j++) {
                if (matrix[i][0] == -1 || matrix[0][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstColZero) {
            for (int i = 0; i < rowCount; i++) {
                matrix[i][0] = 0;
            }
        }
        if (firstRowZero) {
            for (int i = 0; i < colCount; i++) {
                matrix[0][i] = 0;
            }
        }
    }

}