import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int p1 = m - 1, p2 = n - 1;
        int lastIndex = m + n - 1;

        while(p2 >= 0)
        {
            if(p1 >= 0 && arr1[p1] > arr2[p2]){
                arr1[lastIndex] = arr1[p1];
                p1--;
            }

            else{
                arr1[lastIndex] = arr2[p2];
                p2--;
            }

            lastIndex--;
        }


        
        return arr1;
    }
}
