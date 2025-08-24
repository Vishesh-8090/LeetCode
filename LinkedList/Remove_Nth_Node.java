package LinkedList;

import java.util.List;

public class Remove_Nth_Node {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int size = len(head);
        if(n == size){
            head = head.next;
            return head;
        }
        else if(n == 1){
            if(size == 2){
                head.next = null;
                return head;
            }
            for(int i=0; i<size-2; i++){
                node = node.next;
            }
            node.next = null;
            return head;
        }
        else{
            for(int i=0; i<size-n-1; i++){
                node = node.next;
            }
            node.next = node.next.next;
        }
        return head;
    }
    public static int len(ListNode head){
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        return size;
    }

    public static void main(String[] args) {
        ListNode ll = new ListNode();
        ll.insertf(5);
        ll.insertf(4);
        ll.insertf(3);
        ll.insertf(2);
        ll.insertf(1);

        ll.display();
        removeNthFromEnd(ll.getHead(), 3);
        ll.display();
    }
}
