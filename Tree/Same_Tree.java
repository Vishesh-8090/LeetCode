package Tree;

import java.util.Scanner;

public class Same_Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode t = new TreeNode();
        TreeNode t2 = new TreeNode();
        t.populate(sc);
        t2.populate(sc);

        System.out.println(issame(t.getRoot(), t2.getRoot()));
    }
    public static boolean issame(TreeNode p, TreeNode q){
        if(p == null && q != null) return false;
        if(p != null && q == null) return false;
        if(p == null && q == null) return true;

        boolean res = issame(p.left, q.left);
        if(p.val != q.val) return false;
        res = issame(p.right, q.right);

        return res;
    }
}
