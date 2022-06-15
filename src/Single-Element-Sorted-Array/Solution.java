import java.util.ArrayList;

public class Solution {
    public static int uniqueElement(ArrayList<Integer> arr) 
    {
        int i = 0;
        int dup = -1;
        while(i < arr.size()){
            if(arr.get(i) == arr.get(i + 1))
                i+=2;
            else{
                dup = arr.get(i);
            }
        }

        return dup;
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
