import java.util.*;

import javax.rmi.ssl.SslRMIClientSocketFactory;

import java.io.*;
//             if (mpp.containsKey(s.charAt(right))) left = Math.max(mpp.get(s.charAt(right)) + 1, left);

public class Solution {
    public static int uniqueSubstrings(String input) {
        // TC: O(N^2)
        // write your code here
        int left = 0, right = 0;
        int size = input.length();

        // Nested loops
        // Outer for traversing
        // Inner for checking
        int ans = Integer.MIN_VALUE;
        for (left = 0; left < size; left++) {
            HashSet<Character> set = new HashSet<>();
            for (right = left; right < size; right++) {
                if (set.contains(input.charAt(right))) {
                    ans = Math.max(ans, right - left);
                    break;
                }

                else {
                    set.add(input.charAt(right));
                }
            }
        }

        return ans;
    }


    public static int uniqueSubstringsTwo(String input)
    {
        int left = 0, right = 0;
        int ans = Integer.MIN_VALUE;
        HashSet<Character> set = new HashSet<>();
        for(right = 0;  right < input.length(); right++)
        {
            if(set.contains(input.charAt(right)))
            {
                while(left < right && set.contains(input.charAt(right)))
                {
                    left++;
                    set.remove(input.charAt(right));
                }
            }

            set.add(input.charAt(right));
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
    public static void main(String[] args) {
        String str = "abcaabcca";
        System.out.println(uniqueSubstrings(str)); // 3
        String str2 = "kfsmygpcwzvueiaqxjnhdoblrt";
        System.out.println(uniqueSubstrings(str2));
    }
}
