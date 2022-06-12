import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static int findDuplicate(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int[] freqArr = new int[n];
        int dup = -1;
        for (int i = 0; i < n; i++) {
            freqArr[arr.get(i)]++;
        }

        for (int i = 0; i < freqArr.length; i++) {
            if (freqArr[i] > 1) {
                dup = i;
            }
        }

        return dup;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(3);
        arr2.add(4);
        arr2.add(2);
        arr2.add(2);

        System.out.println(findDuplicate(arr2, arr2.size()));
    }
}