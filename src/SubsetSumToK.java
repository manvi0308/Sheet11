import java.util.ArrayList;

public class SubsetSumToK{
    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) 
	{
        // Write your code here.
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(n == 0)
            return res;
        
        if(k == 0)
            return res;
        if(arr.get(n-1) > k)
            res = findSubsetsThatSumToK(arr, n - 1, k);
        return findSubsetsThatSumToK(arr, n - 1, k)  findSubsetsThatSumToK(arr, n - 1, k - arr.get(n - 1));

    }
}