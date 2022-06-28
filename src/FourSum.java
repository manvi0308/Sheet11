public class FourSum {
    public static String fourSum(int[] arr, int target, int n) {
        // Write your code here.
        Arrays.sort(arr);
        for (int i = 0; i < n - 3; i++) {

            for (int j = i + 1; j < n - 2; j++) {
                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    int currentSum = arr[left] + arr[right] + arr[i] + arr[j];

                    if (currentSum > target) {
                        right--;
                    }

                    else if (currentSum < target) {
                        left++;
                    }

                    else {
                        return "Yes";
                    }
                }
            }
        }

        return "No";
    }
}
