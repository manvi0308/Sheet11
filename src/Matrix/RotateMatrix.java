import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class RotateMatrix {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        /*
         * Considering each matrix as a collection of rings
         * 1 2 3 4
         * 5 6 7 8
         * 9 10 11 12
         * 13 14 15 16
         * 
         * RING1
         * 1 2 3 4
         * //!5 8
         * 9 12
         * 13 14 15 16
         * Rotate ring 1
         * 5 1 2 3
         * 9 4
         * 13 8
         * 14 15 16 12
         * 
         * RING2
         * 
         * 6 7
         * 10 11
         */

        rotateMatrixHelper(mat, 0, 0, n, m);
    }

    public static void rotateMatrixHelper(ArrayList<ArrayList<Integer>> mat, int rowStart, int colStart, int rowEnd,
            int colEnd) {
        // Base condition
        if (rowStart >= rowEnd || colStart >= colEnd)
            return;
        if (rowStart >= rowEnd - 1 || colStart >= colEnd - 1)
            return;

        int previous = mat.get(rowStart + 1).get(colStart);
        int current;

        for (int i = colStart; i < colEnd; i++) {
            current = mat.get(rowStart).get(i);
            mat.get(rowStart).set(i, previous);
            previous = current;
        }

        rowStart++;
        for (int i = rowStart; i < rowEnd; i++) {
            current = mat.get(i).get(colEnd - 1);
            mat.get(i).set(colEnd - 1, previous);
            previous = current;
        }

        colEnd--;

        // Move elements of last row from the remaining rows
        if (rowStart < rowEnd) {
            for (int i = colEnd - 1; i >= colStart; i--) {
                current = mat.get(rowEnd - 1).get(i);
                mat.get(rowEnd - 1).set(i, previous);
                previous = current;
            }
        }
        rowEnd--;

        // Move elements of first column from the remaining rows
        if (colStart < colEnd) {
            for (int i = rowEnd - 1; i >= rowStart; i--) {
                current = mat.get(i).get(colStart);
                mat.get(i).set(colStart, previous);
                previous = current;
            }
        }
        colStart++;

        // Recursively rotate inner rings
        rotateMatrixHelper(mat, rowStart, colStart, rowEnd, colEnd);

    }
}