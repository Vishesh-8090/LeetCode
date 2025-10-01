package LinkedList;

public class Swap_Node_inPairs {
    public static void main(String[] args) {
        ListNode ll = new ListNode();
        ll.insertf(4);
        ll.insertf(3);
        ll.insertf(2);
        ll.insertf(1);
        ll.display(ll.getHead());

        ListNode l2 = swapPairs(ll.getHead());
        l2.display(l2.getHead());
    }
    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = head;
        ListNode curr = prev.next;
        ListNode after = new ListNode();
        int i=1;

        while(curr != null){
            // Swap Nodes
            prev.next = curr.next;
            curr.next = prev;
            if(i == 1){
                head = curr;    // Update the head
            }

            // link the pairs
            after.next = curr;
            after = prev;

            // move for next pair
            prev = prev.next;
            if(prev == null){
                return head;
            }
            curr = prev.next;
            i++;
        }
        return head;
    }
}
