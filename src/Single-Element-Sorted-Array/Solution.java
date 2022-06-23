import java.util.ArrayList;

public class Solution {
    // ! This will give TLE error
    public static int uniqueElement(ArrayList<Integer> arr) {
        int i = 0;
        int dup = -1;
        while (i < arr.size()) {
            if (arr.get(i) == arr.get(i + 1))
                i += 2;
            else {
                dup = arr.get(i);
            }
        }

        return dup;
    }
    //! ACCEPTED
    static int findUnique(ArrayList<Integer> arr) {
        /*
         * Intution is since every number appears twice
         * So considering that every number occurs twice,
         * the first occurence of a number should be at even index
         * and second occurence should be at odd index.
         * [1, 1, 2, 2, 3, 3]
         * 
         * Now ATQ, one number appears only once, that means a possible
         * arrangement could be [1, 1, 2, 3, 3]
         * Now if we consider the indexing arrangement, it should be
         * odd and even for the elements before the single occuring element
         * However after the element that occurs only once, the indexing arrangement
         * would be odd even
         * 
         * [1, 1, 2, 2, 3, 3, 4, 5, 5]
         * E O E 0 E 0 E 0 E
         * E and 0 denotes even and odd index
         * 
         * Elements on the left half of target element should follow EO sequence
         * Elements on right side of target element should follow OE sequence
         * 
         * Use BINARY SEARCH
         * Find the middle element
         * If middle index is even,
         * and element on right side is same as middle element
         * That means EO sequence is followed, SHIFT TO THE RIGHT HALF
         * 
         * and element on right side is not same as middle element
         * That means OE sequence is followed, SHIFT TO THE LEFT HALF
         * 
         * If middle index is odd
         * and element on right side is same as middle element
         * That means OE sequence is followed, SHIFT TO THE LEFT HALF
         * 
         * and elenent on right side is not same as middle element
         * That means EO sequence is followed, SHIFT TO RIGHT HALF
         * 
         */

         int low = 0;
         int high = arr.size() - 2;
         while(low <= high)
         {
            int mid = (low + high)/2;
            if(mid%2 == 0){
                if(arr.get(mid) != arr.get(mid + 1)){
                    high = mid - 1;
                }

                else{
                    low = mid + 1;
                }
            }

            else{
                if (arr.get(mid) == arr.get(mid + 1))
                high = mid - 1; 
            else
                low = mid + 1; 
            }
         }

         return arr.get(low);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        System.out.println(uniqueElement(arr));

    }
}
