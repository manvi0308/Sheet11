public class PascalTriangle {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.

        ArrayList<ArrayList<Long>> result = new ArrayList<ArrayList<Long>>();
        for (int i = 0; i < n; i++) {
            ArrayList<Long> temp = new ArrayList<Long>();
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0)
                    temp.add((long) 1);
                else {
                    long element = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                    temp.add(element);
                }

            }

            result.add(temp);
        }
        return result;
    }
}
