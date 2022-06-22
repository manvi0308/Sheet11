import java.util.*;
public class Solution {
    public static int findMajority(int[] arr, int n) {
        // Write your code here.
        if (arr.length == 1)
            return arr[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

    //    System.out.println(map.toString());

        int desiredFrequency = (int)Math.floor(n / 2);
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) > desiredFrequency)
                return arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 20, 20, 20, 4, 5, 20, 1, 20, 4, 20 };
        System.out.println(findMajority(arr, arr.length));
    }
}