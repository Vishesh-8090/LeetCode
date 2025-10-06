package LinkedList;

import java.util.Map;
import java.util.HashMap;

public class Copy_LL {
    public static void main(String[] args) {
        ListNode ll = new ListNode();
        ll.insertf(1);
        ll.insertf(10);
        ll.insertf(11);
        ll.insertf(13);
        ll.insertf(7);

        ListNode l2 = copyRandomList(ll.getHead());
        l2.display(l2);
    }
    public static ListNode copyRandomList(ListNode head) {
        if(head == null) return head;

        Map<ListNode, ListNode> map = new HashMap<>();
        ListNode curr = head;
        while (curr != null) {
            map.put(curr, new ListNode(curr.getVal()));
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            ListNode copy = map.get(curr);
            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }
}