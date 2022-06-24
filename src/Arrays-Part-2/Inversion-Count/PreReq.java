// Merge Sort
public class PreReq {
    static void mergeTwoArrays(int[] arr, int l, int m, int r) {
        // * Basically we are merging two subarraya from the same array
        // * first subarray is from l to m
        // * second subarray is from m + 1 to r

        // ! Get the two subarrays in a separate array

        // & Creating two arrays
        int[] arr1 = new int[m - l + 1];
        int[] arr2 = new int[r - m];
        // & Copying elements from the arr to arr1 and arr2
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[l + i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[m + 1 + j];
        }

        // ! The problem now reduces to merging
        // ! two unsorted separate arrays

        // & Pointers for arr1 and arr2
        int i = 0, j = 0;

        // & Pointer for arr -- final result holding the merged array
        int k = l;

        while (i < arr1.length && j < arr2.length) {
            if (arr[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        // ! Copying the remaining elements
        while (i < arr1.length) {
            arr[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            arr[k++] = arr2[j++];
        }

    }
    //! TC is O(N*log(N))
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            mergeTwoArrays(arr, left, mid, right);
        }
    }


    
}
