package LinkedList;

public class Delete_Mid {
    public static void main(String[] args) {
        ListNode ll = new ListNode();
        ll.insertf(6);
        ll.insertf(2);
        ll.insertf(1);
        ll.insertf(7);
        ll.insertf(4);
        ll.insertf(3);
        ll.insertf(1);

        ll.display(ll.getHead());

        ListNode l2 = deleteMiddle(ll.getHead());
        l2.display(l2);
    }
    public static ListNode deleteMiddle(ListNode head) {
        if(head.next == null) {
            head = null;
            return head;
        }
        if(head.next.next == null){
            head.next = null;
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}
