public class SearchInA2DMatrix {
    static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
		// Write your code here.
          int lowIndex = 0;
        int highIndex = m*n - 1;

        //! Binary Search
        while(lowIndex <= highIndex)
        {
            int middleIndex = (highIndex + lowIndex)/2;
            if(mat.get(middleIndex/n).get(middleIndex%n) == target)
                return true;
            else if(mat.get(middleIndex/n).get(middleIndex%n) < target)
                lowIndex = middleIndex + 1;
            else if(mat.get(middleIndex/n).get(middleIndex%n) > target)
                highIndex = middleIndex - 1;

        }

        return false;
	}
}
