import java.util.* ;

import javax.lang.model.util.ElementScanner14;

import org.w3c.dom.html.HTMLIFrameElement;

import java.io.*; 

public class Solution {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
        int lowIndex = 0;
        int highIndex = m*n - 1;


        //! Binary Search
        while(lowIndex <= highIndex)
        {
            if(mat.get(middleIndex/m).get(middleIndex%m) == target)
                return true;
            else if(mat.get(middleIndex/m).get(middleIndex%m) < target)
                lowIndex = middleIndex + 1;
            else
                highIndex = middleIndex - 1;

        }

        return false;
	}
}
