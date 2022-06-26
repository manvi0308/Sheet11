import java.sql.RowId;

public class FindPivotIndex {
    // 724. Find Pivot Index
    public int pivotIndex(int[] nums) {
        /*
         * The pivot index is the index where the sum of
         * all the numbers strictly to the left of the index
         * is equal to the sum of all the numbers strictly
         * to the index's right.
         */
     int totalSum = 0;
     for(int i = 0; i < nums.length; i++){
        totalSum = totalSum + nums[i];
     }

     int lSum = 0;
     int rSum = 0;
     for(int i = 0; i < nums.length; i++){
        rSum = totalSum - lSum - nums[i];
        if(lSum == rSum)
            return i;
        
        lSum += nums[i];

     }

     return -1;
    }
}
