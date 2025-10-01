package LinkedList;

public class reverse_list2 {
    public static void main(String[] args) {
        ListNode ll = new ListNode();
        ll.insertf(5);
        ll.insertf(4);
        ll.insertf(3);
        ll.insertf(2);
        ll.insertf(1);
        ll.display(ll.getHead());

        ListNode l2 = reverseBetween(ll.getHead(), 3, 4);
        l2.display(l2.getHead());
    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;
        if(left == right) return head;

        ListNode node1 = new ListNode();
        node1.next = head;
        ListNode prev = head;

        for(int i=0; i<left-1; i++){
            node1 = node1.next;
        }
        ListNode node2 = new ListNode();
        node2.next = head;

        for(int i=0; i<=right; i++){
            prev = node2;
            node2 = node2.next;
        }
        prev.next = null;
        node1.next = reverse(node1.next);
//        head = node1;
        ListNode temp = traverse(head);
        temp.next = node2;
        if(left == 1) return node1.next;
        return head;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode node = head;
        ListNode after;

        while(node != null){
            after = node.next;
            node.next = prev;

            prev = node;
            node = after;
        }
        return prev;
    }
    public static ListNode traverse(ListNode head){
        while(head.next != null){
            head = head.next;
        }
        return head;
    }
}
