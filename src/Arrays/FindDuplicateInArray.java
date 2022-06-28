public class FindDuplicateInArray {
    public static int findDuplicate(ArrayList<Integer> arr, int n) {
        int[] freqArr = new int[n];
        int dup = -1;
        for (int i = 0; i < n; i++) {
            freqArr[arr.get(i)]++;
        }

        for (int i = 0; i < freqArr.length; i++) {
            if (freqArr[i] > 1) {
                dup = i;
            }
        }

        return dup;
    }
}
