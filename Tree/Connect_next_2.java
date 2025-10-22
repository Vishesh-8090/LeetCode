package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Connect_next_2 {
    public static void main(String[] args) {
        TreeNode bt = new TreeNode(1);
        bt.left = new TreeNode(2);
        bt.left.left = new TreeNode(4);
        bt.left.right = new TreeNode(5);
        bt.right = new TreeNode(3);
//        bt.right.left = new TreeNode(6);
        bt.right.right = new TreeNode(7);
        bt.setRoot(bt);
        bt.display();
        System.out.println();
        System.out.println();
        TreeNode btn = connect(bt);
        btn.display();
    }
    public static TreeNode connect(TreeNode root) {
        if(root == null) return root;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int len = q.size();
            TreeNode prev = null;

            for(int i=0; i<len; i++){
                TreeNode node = q.poll();
                if(prev != null){
                    prev.next = node;
                }
                prev = node;
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
            }

            prev.next = null;
        }
        return root;
    }
}
