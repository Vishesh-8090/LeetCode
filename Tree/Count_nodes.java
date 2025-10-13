package Tree;

public class Count_nodes {
    public static void main(String[] args) {
        TreeNode bt = new TreeNode(1);
        bt.left = new TreeNode(2);
        bt.left.left = new TreeNode(4);
        bt.left.right = new TreeNode(5);
        bt.right = new TreeNode(3);
        bt.right.left = new TreeNode(6);
        bt.setRoot(bt);
        bt.display();
        System.out.println(countNodes(bt));
    }
    public static int countNodes(TreeNode root) {
        if(root == null) return 0;

        int left = countNodes(root.left);
        int right = countNodes(root.right);

        return 1+left+right;
    }
}
