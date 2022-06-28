public class MajorityElement {
    public static int findMajority(int[] arr, int n) {
		// Write your code here.
        if (arr.length == 1)
            return arr[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

   //     System.out.println(map.toString());

        int desiredFrequency = (int)Math.floor(n / 2);
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) > desiredFrequency)
                return arr[i];
        }

        return -1;
	}
}
