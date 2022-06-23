import java.util.*;
public class KthLargestAndSmallest {
    public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        ans.add(0, arr.get(k));
        ans.add(1, arr.get(n - k));
        return ans;
	}
}
