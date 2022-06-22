import java.util.ArrayList;
import java.util.HashSet;

public class Solution {

    public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int index = 0;
        for(int i = 0; i < arr.size() - k; i++)
        {
            HashSet<Integer> set = new HashSet<>();
            for(int j = i; j < i + k; j++)
            {
                if(!set.contains(arr.get(j))){
                    ans.add(index, arr.get(j) + 1);
                }
            }e
        }
        return ans;
    }
}
