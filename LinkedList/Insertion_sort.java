package LinkedList;

public class Insertion_sort {
    public static void main(String[] args) {
        ListNode ll = new ListNode();
        ll.insertf(0);
        ll.insertf(4);
        ll.insertf(3);
        ll.insertf(5);
        ll.insertf(-1);

        ll.display(ll.getHead());
        ListNode l2 = insertionSortList(ll.getHead());
        l2.display(l2);
    }
    public static ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode res = new ListNode();
        ListNode temp = head;

        while(temp != null){
            ListNode prev = res;
            ListNode key = temp.next;

            while(prev.next != null && prev.next.getVal() < temp.getVal()){
                prev = prev.next;
            }
            temp.next = prev.next;
            prev.next = temp;

            temp = key;
        }
        return res.next;
    }
}
