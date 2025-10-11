package Tree;

public class Balanced_Tree {
    public static void main(String[] args) {
        TreeNode bt = new TreeNode(3);
        bt.left = new TreeNode(9);
        bt.right = new TreeNode(20);
        bt.right.left = new TreeNode(15);
        bt.right.right = new TreeNode(7);
        bt.setRoot(bt);
        bt.display();

        System.out.println(isBalanced(bt));
    }
    public static boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int left = height(root.left);
        int right = height(root.right);

        if(Math.abs(right-left) > 1){
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }
    public static int height(TreeNode root) {
        if(root == null) return 0;

        int lDepth = height(root.left);
        int rDepth = height(root.right);

        return Math.max(lDepth, rDepth)+1;
    }
}
