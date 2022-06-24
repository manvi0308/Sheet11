import java.util.Stack;

public class Solution {
    /*
     * The approach is that the bracket which is opened last time should be closed
     * the first time
     * 
     * [(]) Invalid
     * Reason: ( should get closed first
     */
    public static boolean isValidParenthesis(String expression) {
        Stack<Character> stack = new Stack<>();
        //& If the current character is opening bracket, push it to the stack
        //& If the current character is closing bracket, then it should have its corresponding
        //& opening bracket on the top of the stack

        for(char current: expression.toCharArray())
        {
            if(current == '(' || current == '[' || current == '{'){
                stack.push(current);
            }
            else{
                //! Now the top of the stack should contain the  opening bracket 
                //! of the corresponding closing bracket
                if(stack.isEmpty())
                    return false;
                char stackTop = stack.pop();
                if((stackTop == '(' && current == ')') || (stackTop == '{' && current == '}') || (stackTop =='[' && current == ']'))
                   continue;
                else
                    return false;

            }
        
        }

        return stack.isEmpty();
    }
}