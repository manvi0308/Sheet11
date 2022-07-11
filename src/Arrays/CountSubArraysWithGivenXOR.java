import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class CountSubArraysWithGivenXOR {
    public static int subarraysXor(ArrayList<Integer> arr, int x) {
        // Inputs Output
        // 0 0 0
        // 0 1 1
        // 1 0 1
        // 1 1 0

        // Approach 1: Iterate through each subarray using two nested loops
        // ! TLE
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int currentXOR = 0;
            for (int j = i; j < arr.size(); j++) {
                currentXOR = currentXOR ^ arr.get(j).intValue();

                if (currentXOR == x)
                    count++;
            }
        }
        return count;

    }

    public static int subarraysXor2(ArrayList<Integer> arr, int x) {
        // Suppose there is a number a from the array
        // Now you need a number b such that a^b == x
        // You need to find b
        // a^b^a = x^a -- 1
        // a^a = 0 -- 2
        // 0^b = b -- 3
        // Putting the value of a^a from 2 and using 3 in 1
        // b = x^a
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int currentXOR = 0;
        map.put(0, 1);
        for (int i = 0; i < arr.size(); i++) {
            currentXOR = currentXOR ^ arr.get(i).intValue();
            int req = currentXOR ^ x;
            if (map.containsKey(req)) {
                ans += map.get(req);
            }

            if (map.containsKey(currentXOR)) {
                map.put(currentXOR, map.get(currentXOR) + 1);
            }

            else {
                map.put(currentXOR, 1);
            }
        }

        return ans;
    }
}
