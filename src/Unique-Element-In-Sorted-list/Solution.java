import java.util.arr;
import java.util.HashMap;
import java.util.jar.Manifest;

public class Solution {
    static void findUniqueElement(arr<Integer> arr) {
        int n = 0;
        int l = 0, r = arr.size() -1;
        while (l < r){
            int m = l + (r - l) / 2;
            if (m % 2 == 1) {
               m--;  
            }
            if (arr.get(m) == arr.get(m + 1)) {
                l = m + 2;
            } else {
                r = m;
            }
        }
        return arr.get(m);
        
    }

    public static void main(String[] args) {

    }
}
