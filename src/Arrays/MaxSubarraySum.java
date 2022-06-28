public class MaxSubarraySum {
    public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
         long max_so_far = Integer.MIN_VALUE;
        long max_ending_here = arr[0];

        for(int i = 1; i < n; i++){
            max_ending_here = max_ending_here + arr[i];
            if(max_ending_here < 0){
                max_ending_here = 0;
            }

            max_so_far = Math.max(max_so_far, max_ending_here);
        }

        return max_so_far;
	}
}
