package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSide_View {
    public static void main(String[] args) {
        TreeNode bt = new TreeNode(1);
        bt.left = new TreeNode(2);
        bt.right = new TreeNode(3);
        bt.left.right = new TreeNode(5);
        bt.left.right.right = new TreeNode(7);
        bt.right.right = new TreeNode(4);
        bt.setRoot(bt);
        bt.display();

        List<Integer> rightview = rightSideView(bt);
        for (int value : rightview) {
            System.out.print(value+" ");
        }
    }
    public static List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int len = q.size();

            for(int i=0; i<len; i++){
                TreeNode node = q.poll();

                if(i == len-1) res.add(node.val);

                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
            }
        }

        return res;
    }
}
