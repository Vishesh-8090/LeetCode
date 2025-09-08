package LinkedList;

public class Cycle_Detect {
    public static void main(String[] args) {
        ListNode ll = new ListNode();
        ll.insertf(-4);
        ll.insertf(0);
        ll.insertf(2);
        ll.insertf(3);
        ListNode temp = ll.getHead();

        while(temp.next != null){
            temp = temp.next;
        }
        ListNode temp2 = ll.getHead();
        while (temp2.getVal() != 2){
            temp2 = temp2.next;
        }
        temp.next = temp2;

        ListNode l2 = detectCycle(ll.getHead());
        System.out.println(l2.getVal());
    }
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                fast = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
