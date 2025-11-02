package Tree;

import java.util.List;

public class List_to_BST {
    public static void main(String[] args) {
        ListNode ll = new ListNode();
        ll.insertf(9);
        ll.insertf(5);
        ll.insertf(0);
        ll.insertf(-3);
        ll.insertf(-10);
        ll.display(ll.getHead());

        TreeNode BST = sortedListToBST(ll.getHead());
        BST.setRoot(BST);
        BST.display();
    }
    public static TreeNode sortedListToBST(ListNode head) {
        return Tree(head);
    }
    public static TreeNode Tree(ListNode head){
        if(head == null) return null;
        if (head.next == null) return new TreeNode(head.getVal());

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev != null) prev.next = null;
        TreeNode root = new TreeNode(slow.getVal());

        root.left = Tree(head);
        root.right = Tree(slow.next);

        return root;
    }
}
