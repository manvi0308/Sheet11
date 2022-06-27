import java.util.HashSet;

import javax.print.attribute.HashPrintServiceAttributeSet;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
      HashSet<Integer> set = new HashSet<>();
      for(int i:arr)
      {
        set.add(i);
      }

      int finalAns = 0;

      for(int i : arr)
      {
        if(set.contains(i - 1))
        {
            int currentNum = i;
            int currentStreak = 1;

            while(set.contains(currentNum + 1))
            {
                currentNum++;
                currentStreak++;
            }

            finalAns = Math.max(finalAns, currentStreak);
        }
      }

      return finalAns;
    }
}
