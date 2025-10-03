package LinkedList;

public class Add_Two_Nos_2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        l1.insertf(3);
        l1.insertf(4);
        l1.insertf(2);
        l1.insertf(7);

        ListNode l2 = new ListNode();
        l2.insertf(4);
        l2.insertf(6);
        l2.insertf(5);

        ListNode l3 = addTwoNumbers(l1.getHead(), l2.getHead());
        l3.display(l3);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;
            if(l1 != null){
                sum += l1.getVal();
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.getVal();
                l2 = l2.next;
            }
            temp.next = new ListNode(sum % 10);
            carry = sum / 10;
            temp = temp.next;
        }
        return reverse(dummy.next);
    }
    public static ListNode reverse(ListNode ll){
        ListNode prev = null;
        ListNode curr = ll;
        ListNode after;

        while(curr != null){
            after = curr.next;
            curr.next = prev;

            prev = curr;
            curr = after;
        }
        return prev;
    }
}
