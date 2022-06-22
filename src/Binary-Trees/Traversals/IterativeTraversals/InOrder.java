import java.util.Stack;
public class InOrder extends PreOrder{
   static void inOrder(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode curr = root;
    while(curr != null || stack.size() > 0)
    {
        while(curr != null){
            stack.push(curr);
            curr = curr.left;
        }

        curr = stack.pop();
        System.out.println(curr.data);
        curr = curr.right;
    }
   }
}
