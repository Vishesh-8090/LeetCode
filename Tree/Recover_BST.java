package Tree;

import java.util.ArrayList;
import java.util.List;

public class Recover_BST {
    public static void main(String[] args) {
        TreeNode bst = new TreeNode(3);
        bst.left = new TreeNode(1);
        bst.right = new TreeNode(4);
        bst.right.left = new TreeNode(2);
        bst.setRoot(bst);
        bst.display();
        recoverTree(bst);
        bst.display();
    }
    public static void recoverTree(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);

        int[] arr = new int[res.size()];
        for(int i=0; i<arr.length; i++){
            arr[i] = res.get(i);
        }

        mergesort(arr, 0, arr.length);
        tree(root, arr, new int[]{0});
    }
    public static void tree(TreeNode root, int[] arr, int[] idx){
        if(root == null) return;

        tree(root.left, arr, idx);
        root.val = arr[idx[0]++];
        tree(root.right, arr, idx);
    }
    public static void inorder(TreeNode root, List<Integer> res){
        if(root == null) return;

        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
    public static void mergesort(int[] arr, int s, int e){
        if(e-s == 1) return;

        int mid = s + (e-s)/2;
        mergesort(arr, s, mid);
        mergesort(arr, mid, e);

        merge(arr, s, mid, e);
    }
    public static void merge(int[] arr, int s, int mid, int e){
        int[] mix = new int[e-s];

        int i = s;
        int j = mid;
        int k = 0;

        while(i < mid && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l = 0; l<mix.length; l++){
            arr[s+l] = mix[l];
        }
    }
}
