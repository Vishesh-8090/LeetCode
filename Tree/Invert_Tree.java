package Tree;

public class Invert_Tree {
    public static void main(String[] args) {
        TreeNode bt = new TreeNode(2);
        bt.left = new TreeNode(1);
        bt.right = new TreeNode(3);
        bt.setRoot(bt);
        bt.display();

        TreeNode t = invertTree(bt);
        t.setRoot(t);
        t.display();
    }
    public static TreeNode invertTree(TreeNode root) {
        if(root == null) return root;

        TreeNode newBT = new TreeNode();
        newBT = build(root, newBT);
        return newBT;
    }
    public static TreeNode build(TreeNode root, TreeNode node){
        if(root == null) return root;

        node = new TreeNode(root.val);
        node.left = build(root.right, node.left);
        node.right = build(root.left, node.right);
        return node;
    }
}
