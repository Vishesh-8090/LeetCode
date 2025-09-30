package LinkedList;

public class Odd_Even {
    public static void main(String[] args) {
        ListNode ll = new ListNode();
        ll.insertf(2);
        ll.insertf(5);
        ll.insertf(2);
        ll.insertf(3);
        ll.insertf(4);
        ll.insertf(1);

        ListNode l1 = oddEvenList(ll.getHead());
        l1.display();
    }
    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return head;
        ListNode odd = new ListNode();
        ListNode temp1 = odd;
        temp1.next = head;
        temp1 = temp1.next;
        ListNode even = new ListNode();
        ListNode temp2 = even;

        ListNode node = head.next;
        int idx = 2;

        while(node != null){
            if(idx%2 == 0){
                temp2.next = node;
                temp2 = temp2.next;
            }else{
                temp1.next = node;
                temp1 = temp1.next;
            }
            node = node.next;
            idx++;
        }
        temp2.next = null;
        temp1.next = even.next;
        return odd.next;
    }
}
