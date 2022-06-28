public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int prevElement = arr.get(0);
        int ans = 1;
        for (int i = 1; i < n; i++) {
            int currentElement = arr.get(i);
            if (currentElement != prevElement) {
                ans++;
                prevElement = currentElement;
            }
        }

        return ans;
    }
}
