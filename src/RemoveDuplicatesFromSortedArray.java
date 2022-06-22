import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
        int prevElement = arr.get(0);
        //& Initializing ans with 1, because at any cost the arr would have a single
        //& unique element
        int ans = 1;
        for(int i = 1; i < n; i++)
        {
            int currentElement = arr.get(i);
            //& Means the current element is a unique element
            //& so the number of unique elements will go up by 1
            if(currentElement != prevElement)
            {
                ans++;
                prevElement = currentElement;
            }
        }

        return ans;
	}
}
