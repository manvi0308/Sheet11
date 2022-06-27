import java.util.*;
import java.io.*;

public class Solution {
  public static String fourSum(int[] arr, int target, int n) {
    /*
     * 1 3 3 10 2
     * target = 9
     * 
     * O/P Yes
     * 1, 3, 3 and 2 sum upto 9
     * 
     * i = 0
     * j = i + 1
     * left = j + 1
     * right = n - 1
     * Use two pointers left and right inside the while condition
     * 
     * O(N^3)
     */
 
    Arrays.sort(arr);
    for (int i = 0; i < n - 3; i++) {
      for (int j = i + 1; j < n - 2; j++) {
        int left = j + 1;
        int right = n - 1;

        while (left < right) {
          int currentSum = arr[left] + arr[right] + arr[i] + arr[j];

          if (currentSum > target) {
            right--;
          }

          else if (currentSum < target) {
            left++;
          }

          else {
            return "Yes";
          }
        }
      }
    }

    return "No";
  }
}
