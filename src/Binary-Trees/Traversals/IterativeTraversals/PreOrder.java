import java.util.Stack;

class TreeNode{
    TreeNode left, right;
    int data;
    TreeNode(int data){
        this.data = data;
    }
}

public class PreOrder {

    static void iterativePreOrder(TreeNode root){
        if(root == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(stack.isEmpty()==false){
            TreeNode node = stack.peek();
            System.out.println(node.data);
            stack.pop();
            if(node.right != null){
                stack.push(node.right);
            }

            if(node.left != null){
                stack.push(node.left);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        iterativePreOrder(root);
    }
}
