package LinkedList;

public class Max_Twin_Sum {
    public static void main(String[] args) {
        ListNode ll = new ListNode();
        ll.insertf(1);
        ll.insertf(2);
        ll.insertf(4);
        ll.insertf(5);
        ll.display(ll.getHead());

        System.out.println(pairSum(ll.getHead()));
    }
    public static int pairSum(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverse(slow);
        ListNode firstHalf = head;

        int maxSum = 0;
        while (secondHalf != null) {
            int sum = firstHalf.getVal() + secondHalf.getVal();
            maxSum = Math.max(maxSum, sum);
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return maxSum;
    }
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;

            prev = head;
            head = nextNode;
        }
        return prev;
    }
}
