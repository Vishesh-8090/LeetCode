package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Left_most {
    public static void main(String[] args) {
        TreeNode bt = new TreeNode(1);
        bt.left = new TreeNode(2);
        bt.left.left = new TreeNode(4);
        bt.right = new TreeNode(3);
        bt.right.left = new TreeNode(5);
        bt.right.right = new TreeNode(6);
        bt.right.left.left = new TreeNode(7);
        bt.setRoot(bt);
        bt.display();

        System.out.println(findBottomLeftValue(bt));
    }
    public static int findBottomLeftValue(TreeNode root) {
        if(root == null) return -1;

        Queue<TreeNode> q = new LinkedList<>();
        TreeNode res = null;

        q.offer(root);

        while(!q.isEmpty()){
            int len = q.size();
            res = q.peek();

            for(int i=0; i<len; i++){
                TreeNode node = q.poll();

                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
        }
        return res.val;
    }
}
