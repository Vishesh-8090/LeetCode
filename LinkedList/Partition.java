package LinkedList;

public class Partition {
    public static void main(String[] args) {
        ListNode ll = new ListNode();
        ll.insertf(2);
        ll.insertf(5);
        ll.insertf(2);
        ll.insertf(3);
        ll.insertf(4);
        ll.insertf(1);

        ListNode l1 = partition(ll.getHead(),3);
        ll.display(ll.getHead());
    }
    public static ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode();
        ListNode temp1 = small;
        ListNode large = new ListNode();
        ListNode temp2 = large;

        ListNode node1 = head;

        while(node1 != null){
            if(node1.getVal() < x){
                temp1.next = node1;
                temp1 = temp1.next;
            }else{
                temp2.next = node1;
                temp2 = temp2.next;
            }
            node1 = node1.next;
        }
        temp2.next = null;
        temp1.next = large.next;
        return small.next;
    }
}
