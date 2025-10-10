package Tree;

import java.util.Scanner;

public class Symmetric {
    public static void main(String[] args) {
        TreeNode bt = new TreeNode();
        bt.populate(new Scanner(System.in));
        System.out.println(issame(bt.getRoot().left, bt.getRoot().right));
    }
    public static boolean issame(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;

        if(p.val != q.val) return false;

        return issame(p.left, q.right) && issame(p.right, q.left);
    }
}
