package LinkedList;

public class Delete_Mid {
    public static void main(String[] args) {
        ListNode ll = new ListNode();
        ll.insertf(6);
        ll.insertf(2);
        ll.insertf(1);
        ll.insertf(7);
        ll.insertf(4);
        ll.insertf(3);
        ll.insertf(1);
        ll.display(ll.getHead());

        ListNode l2 = deleteMiddle(ll.getHead());
        l2.display(l2);
    }
    public static ListNode deleteMiddle(ListNode head) {
        if(head.next == null) {
            head = null;
            return head;
        }
        if(head.next.next == null){
            head.next = null;
            return head;
        }

        int mid = size(head)/2;
        ListNode temp = head;
        ListNode prev = null;
        for(int i=0; i<mid; i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        return head;
    }
    public static int size(ListNode head){
        int len = 0;
        while(head != null){
            head = head.next;
            len++;
        }
        return len;
    }
}
