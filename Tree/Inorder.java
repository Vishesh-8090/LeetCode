package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inorder {
    public static void main(String[] args) {
        TreeNode bt = new TreeNode();
        bt.populate(new Scanner(System.in));
        bt.display();
        System.out.println(inorderTraversal(bt.getRoot()));
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        inorder(root, res);
        return res;
    }
    public static void inorder(TreeNode node, List<Integer> res){
        if(node == null) return;

        inorder(node.left, res);
        res.add(node.val);
        inorder(node.right, res);
    }
}
