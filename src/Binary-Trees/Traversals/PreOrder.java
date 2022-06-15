class TreeNode
{
    int data;
    TreeNode left, right;
    TreeNode(int data){
        this.data = data;
        left = right = null;
    }
}

public class PreOrder {

    static void preOrder(TreeNode root){
        if(root == null)
            return;
        // Root Left Right
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);

    }

    static void inOrder(TreeNode root)
    {
        if(root == null)
            return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    static void postOrder(TreeNode root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
    //    preOrder(root);
    //    inOrder(root);
    postOrder(root);
    }
}


