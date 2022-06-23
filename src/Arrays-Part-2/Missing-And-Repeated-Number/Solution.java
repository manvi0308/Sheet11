import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int[] res = new int[2];
        int[] freqArr = new int[n + 1];
        for(int i = 0; i < n; i++){
            freqArr[arr.get(i)]++;
        }

        for(int i = 1; i < n + 1; i++){
            if(freqArr[i] == 0)
            {
                res[0] = i;
            }

            if(freqArr[i] > 1){
                res[1] = i;
            }
        }
        return res;
    }
}