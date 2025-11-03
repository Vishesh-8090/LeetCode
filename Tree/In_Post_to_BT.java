package Tree;

import java.util.HashMap;
import java.util.Map;

public class In_Post_to_BT {
    static int root_idx;
    static Map<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        int[] in = {9,3,15,20,7};
        int[] post = {9,15,7,20,3};

        TreeNode Bt = buildTree(in, post);
        Bt.setRoot(Bt);
        Bt.display();
    }
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        root_idx = postorder.length-1;

        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }

        return subtree(postorder, 0, inorder.length-1);
    }
    public static TreeNode subtree(int[] postorder, int s, int e){
        if(s > e) return null;

        int root = postorder[root_idx--];
        TreeNode node = new TreeNode(root);

        int mid = map.get(root);

        node.right = subtree(postorder, mid+1, e);
        node.left = subtree(postorder, s, mid-1);

        return node;
    }
}
