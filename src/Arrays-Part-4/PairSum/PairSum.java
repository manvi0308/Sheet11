import java.awt.List;
import java.util.Arrays;
import java.util.HashMap;

public class PairSum{
    public static int[][] pairSum(int[] arr, int s)
    {
        List<int[]> result = new ArrayList();
        int size = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        // Store element of array as the key
        // Store count of element as the value
        // Storing index will be useless as we are not concerned with 
        // the positioning of elements, rather storing count will be 
        // beneficial for helping with duplicate elements
        for(int i = 0; i < arr.length; i++)
        {
            //& The idea is to check if the element exists or not
            //& If the element does existed previously then there would be a entry in the hashmap
            //& for that element, and the current occurence of the element would simply cause
            //& the frequency to increase by 1

            //^ getOrDefault -- first parameter is the key, get the count corresponding to that key
            //^ second parameter is default count, that is if the element doesn't exist then return that count

            int freqOfElement = hm.getOrDefault(s - arr[i], 0);
            int[] dummyPair = new int[2];
            dummyPair[0] = arr[i];
            dummyPair[1] = s - arr[i];
            //^ Note that this while loop doesn't execute if the elements does not exits
            while(freqOfElement > 0)
            {
                result.add(dummyPair);
                freqOfElement--;
            }
            //! Using getOrDefault such that it should be able to handle duplicate elements as well
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);



        }


        int[][] answer = new int[result.size()][2];
        //! Feeding the values to the matrix
        for(int i = 0; i < result.size(); i++)
        {
            int a = result.get(i)[0];
            int b = result.get(i)[1];

            answer[i][0] = Math.min(a, b);
            answer[i][1] = Math.max(a, b);
        }

        //! Sorting it on the basis of first column
        Arrays.sort(answer, new Comparator<int[]>(){
            public int compare(int[] a, int[] b)
            {
                if(a[0] == b[0]){
                    return a[1] - b[1];
                }

                return a[0] - b[0];
            }
        });
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

    }
}