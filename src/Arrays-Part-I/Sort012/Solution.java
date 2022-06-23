import java.util.*;
import java.io.*;

/*2
6
0 1 2 2 1 0
7
 */
public class Solution {
    public static void sort012(int[] arr) {
        // Write your code here
        int ct0 = 0;
        int ct1 = 0;
        int ct2 = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                ct0++;
            } else if (arr[i] == 1) {
                ct1++;
            } else {
                ct2++;
            }
        }
        int i = 0;
        while (ct0 > 0) {
            arr[i] = 0;
            ct0--;
            i++;
        }

        while (ct1 > 0) {
            arr[i] = 1;
            ct1--;
            i++;
        }
        while (ct2 > 0) {
            arr[i] = 2;
            ct2--;
            i++;
        }

        /* Not applicable for Codestudio
         * for (int j = 0; j < n; j++) {
         * System.out.print(arr[j] + " ");
         * }
         * 
         * System.out.println();
         */
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 2, 1, 0 };
        sort012(arr);
    }
}