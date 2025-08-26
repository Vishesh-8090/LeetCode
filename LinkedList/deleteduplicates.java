package LinkedList;

public class deleteduplicates {
    public static void main(String[] args) {
        ListNode ll = new ListNode();
        ll.insertf(5);
        ll.insertf(4);
        ll.insertf(4);
        ll.insertf(3);
        ll.insertf(2);
        ll.insertf(1);
        ll.insertf(1);
        ll.display();
        deleteDup(ll.getHead());
        ll.display();
    }
    public static ListNode deleteDup(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode node = head;
        ListNode temp = new ListNode();
        temp.next = head;
        ListNode prev = temp;

        while(node != null && node.next != null){
            if (node.getVal() == node.next.getVal()) {
                while (node.next != null && node.getVal() == node.next.getVal()) {
                    node = node.next;
                }
                prev.next = node.next;
            } else {
                prev = prev.next;
            }
            node = node.next;
        }
        return temp.next;
    }
}
