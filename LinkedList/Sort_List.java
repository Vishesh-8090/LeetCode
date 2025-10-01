package LinkedList;

public class Sort_List {
    public static void main(String[] args) {
        ListNode ll = new ListNode();
        ll.insertf(0);
        ll.insertf(4);
        ll.insertf(3);
        ll.insertf(-1);
        ll.insertf(5);
        ll.display(ll.getHead());

        ListNode l2 = sortList(ll.getHead());
        l2.display(ll.getHead());
    }
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode mid = getMid(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        left = sortList(left);
        right = sortList(right);

        return merge(left, right);
    }
    public static ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return prev;
    }
    public static ListNode merge(ListNode list1, ListNode list2){
        ListNode res = new ListNode();
        ListNode k = res;

        while(list1 != null && list2 != null){
            if(list1.getVal() <= list2.getVal()){
                k.next = list1;
                list1 = list1.next;
            }else{
                k.next = list2;
                list2 = list2.next;
            }
            k = k.next;
        }
        if(list1 != null){
            k.next = list1;
        }
        if(list2 != null){
            k.next = list2;
        }
        return res.next;
    }
}
