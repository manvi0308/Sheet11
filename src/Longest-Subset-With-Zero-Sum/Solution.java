import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class Solution {

    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

        // Write your code here.
        HashMap<Integer, Integer> hMap = new HashMap<>();
        int length = 0;
        int cumSum = 0;

        for (int i = 0; i < arr.size(); i++) {
            cumSum = cumSum + arr.get(i);
            if (arr.get(i) == 0 && length == 0)
                length = 1;
            if (cumSum == 0)
                length = i + 1;

            if (hMap.containsKey(cumSum)) {
                length = Math.max(length, i - hMap.get(cumSum));
            } else {
                hMap.put(cumSum, i);
            }
        }

        return length;
    }
}