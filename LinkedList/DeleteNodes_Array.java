package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class DeleteNodes_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        ListNode ll = new ListNode();
        ll.insertf(5);
        ll.insertf(4);
        ll.insertf(3);
        ll.insertf(2);
        ll.insertf(1);
        ll.display(ll.getHead());

        ListNode l2 = modifiedList(arr, ll.getHead());
        l2.display(l2);

    }
    public static ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode(0, head);
        Set<Integer> map = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            map.add(nums[i]);
        }

        ListNode node = dummy;

        while (node.next != null){
            if (map.contains(node.next.getVal())){
                node.next = node.next.next;
            }
            else {
                node = node.next;
            }
        }
        return dummy.next;
    }
}
