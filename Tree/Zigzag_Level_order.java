package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Zigzag_Level_order {
    public static void main(String[] args) {
        TreeNode bt = new TreeNode(1);
        bt.left = new TreeNode(2);
        bt.right = new TreeNode(3);
        bt.left.left = new TreeNode(4);
        bt.right.right = new TreeNode(5);
        bt.setRoot(bt);
        bt.display();

        List<List<Integer>> res = zigzagLevelOrder(bt);

        for (List<Integer> arr : res) {
            for (int el : arr) {
                System.out.print(el+" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int sign = 1;

        while(!q.isEmpty()){
            int len = q.size();
            LinkedList<Integer> list = new LinkedList<>();

            for(int i=0; i<len; i++){
                TreeNode temp = q.poll();

                if(sign == 1){
                    list.addLast(temp.val);
                }else{
                    list.addFirst(temp.val);
                }
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }
            res.add(list);
            sign *= -1;
        }
        return res;
    }
}
