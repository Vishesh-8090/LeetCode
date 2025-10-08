package Tree;

import java.util.Scanner;

public class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    private TreeNode root;
    public TreeNode getRoot(){ return root;}
    public void setRoot(TreeNode root){
        this.root = root;
    }

    public TreeNode(){}
    public TreeNode(int val){
        this.val = val;
    }
    public void populate(Scanner sc){
        System.out.println("Enter the value of root Node: ");
        int value = sc.nextInt();
        root = new TreeNode(value);
        populate(sc, root);
    }
    private void populate(Scanner sc, TreeNode node){
        System.out.println("Do you want to enter the left of "+node.val+" (y/n): ");
        String left = sc.next();
        if (left.equals("y")){
            System.out.println("Enter the value of the left Node : ");
            int value = sc.nextInt();
            node.left = new TreeNode(value);
            populate(sc, node.left);
        }

        System.out.println("Do you want to enter the right of "+node.val+" (y/n): ");
        String right = sc.next();
        if(right.equals("y")){
            System.out.println("Enter the value of the right Node: ");
            int value = sc.nextInt();
            node.right = new TreeNode(value);
            populate(sc, node.right);
        }
    }
    public void display(){
        display(root, 0);
    }
    private void display(TreeNode node, int level){
        if(node == null) return;

        display(node.right, level+1);
        if(level != 0){
            for (int i=0; i<level-1; i++){
                System.out.print("|\t");
            }
            System.out.println("|--->"+node.val);
        }else {
            System.out.println(node.val);
        }

        display(node.left, level+1);
    }
}
