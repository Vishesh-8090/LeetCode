package LinkedList;

public class Reverse_in_K {
    public static void main(String[] args) {
        ListNode ll = new ListNode();
        ll.insertf(5);
        ll.insertf(4);
        ll.insertf(3);
        ll.insertf(2);
        ll.insertf(1);
        ll.display();

        ListNode l2 = reverseKGroup(ll.getHead(), 2);
        l2.display();
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        ListNode temp = head;
        for(int i=0; i<k; i++){
            if(temp == null) return head;
            temp = temp.next;
        }
        ListNode node = reverse(head, temp);
        head.next = reverseKGroup(temp, k);
        return node;
    }
    public static ListNode reverse(ListNode curr, ListNode end){
        ListNode prev = null;

        while(curr != end){
            ListNode after = curr.next;
            curr.next = prev;

            prev = curr;
            curr = after;
        }
        return prev;
    }
}
