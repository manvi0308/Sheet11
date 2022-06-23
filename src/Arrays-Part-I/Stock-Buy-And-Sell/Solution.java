import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static int maximumProfit(ArrayList<Integer> prices) {
        // Write your code here.
        int maxProfit = Integer.MIN_VALUE;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.size(); i++) {
            minPrice = Math.min(minPrice, prices.get(i));
            maxProfit = Math.max(maxProfit, prices.get(i) - minPrice);
        }

        return maxProfit;
    }
}