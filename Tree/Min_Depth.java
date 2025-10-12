package Tree;

public class Min_Depth {
    public static void main(String[] args) {
        TreeNode bt = new TreeNode(2);
        bt.right = new TreeNode(3);
        bt.right.right = new TreeNode(4);
        bt.right.right.right = new TreeNode(5);
        bt.right.right.right.right = new TreeNode(6);
        bt.setRoot(bt);
        bt.display();
        System.out.println(minDepth(bt));
    }
    public static int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if(left == 0 || right == 0) return left+right+1;

        return Math.min(left, right) + 1;
    }
}
