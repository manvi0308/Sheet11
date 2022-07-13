import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        // Write your code here
        // IV -- 5 - 1 -- 4
        // Iterating from last position, if the current
        // character is lesser than the character seen before
        // that means subtract less value from high value
        // and vice versa
        // VI --
        // ptr
        // V > I --> ADD
        int number = 0;
        int prevNumber = 0;

        HashMap<Character, Integer> hMap = new HashMap<>();
        hMap.put('I', 1);
        hMap.put('V', 5);
        hMap.put('X', 10);
        hMap.put('L', 50);
        hMap.put('C', 100);
        hMap.put('D', 500);
        hMap.put('M', 1000);

        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);
            int currentNumber = hMap.get(ch);
            if(currentNumber >= prevNumber){
                number+=currentNumber;
            }
            else{
                number-=currentNumber;
            }

            prevNumber = currentNumber;
        }
        return number;
    }
}
