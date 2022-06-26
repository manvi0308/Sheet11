public class SearchInRotatedSorted {
    public int search(int[] nums, int target) {
        // return the index of the target
        int low = 0;
        int high = nums.length - 1;
        
        while(low <= high)
        {
            int mid = (low + high) >> 1;
            if(nums[mid] == target)
                return mid;
            // if the left half is sorted
            if(nums[mid] >= nums[low]){
                // whether target in left half or not
                
                // search in the left half
                if(target >= nums[low] && target <= nums[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            
            // right half is sorted
            else{
                
                // whether target in right half or not
                if(target >= nums[mid] && target <= nums[high])
                {
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        
        return -1; // element not found
    }
}
