//ToDo You are supposed to find all the elements that occur 
//ToDo strictly more than floor(N/3) times in the given array/list.

import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int n = arr.size();
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hmap.put(arr.get(i), hmap.getOrDefault(arr.get(i), 0) + 1);
        }

        //System.out.println(hmap);
        // Iterate through the HashMap.
        for (Map.Entry<Integer, Integer> e : hmap.entrySet()) 
        {
            // Store all the elements with frequency greater than n/3.
            if (e.getValue() > n / 3) 
            {
                answer.add(e.getKey());
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // 3 2 2 1 5 2 3
        arr.add(3);
        arr.add(2);
        arr.add(2);

        arr.add(1);
        arr.add(5);
        arr.add(2);
        arr.add(3);
        ArrayList<Integer> res = majorityElementII(arr);
        System.out.println(res.toString());

    }
}