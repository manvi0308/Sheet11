public class CheckSubSequence {
    // ! Take two pointers, i and j for the s and t string respectively
    // ! Increment the i pointer only when characters at i and j index match
    // ! The j pointer will otherwise be incremented at every step
    /*
     * s = abc
     * t = ahbgdc
     * 
     * i = 0, j = 0;
     * i = 1 (After a and a match)
     * j = 1
     * 
     * Characters don't match now at 1 and 1
     * j will increase to 2
     * 
     * i = 1
     * j = 2
     * Characters match now, i will increase by 1 and j will also increase by 1
     * 
     * i = 2
     * j = 3
     * Characters don't match now at 2 and 3, i will remain the same
     * j will increase to 4
     * 
     * i = 2
     * j = 4
     * 
     * Characters don't match now at 2 and 4, i will remain the same
     * j will increase to 5
     * i = 2
     * j = 5
     * Characters match now
     * Also the complete string is traversed, so return true
     * 
     */
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        if (i == s.length()) {
            return true;
        }
        return false;
    }
}