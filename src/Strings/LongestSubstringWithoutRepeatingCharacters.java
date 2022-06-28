public class LongestSubstringWithoutRepeatingCharacters {
    public static int uniqueSubstrings(String input) {
        // write your code here
        int left = 0, right = 0;
        int ans = Integer.MIN_VALUE;
        HashSet<Character> set = new HashSet<>();
        for (right = 0; right < input.length(); right++) {
            if (set.contains(input.charAt(right))) {
                while (left < right && set.contains(input.charAt(right))) {
                    set.remove(input.charAt(left));
                    left++;
                }
            }

            set.add(input.charAt(right));
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
