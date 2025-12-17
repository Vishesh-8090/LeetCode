package LinkedList;

import java.util.Objects;

public class Intersection_list {
    public static void main(String[] args) {
        ListNode common = new ListNode(8);
        common.next = new ListNode(9);
        common.next.next = new ListNode(10);

        ListNode headA = new ListNode(5);
        headA.next = common;

        ListNode headB = new ListNode(1);
        headB.next = new ListNode(2);
        headB.next.next = new ListNode(3);
        headB.next.next.next = common;

        ListNode intersection = getIntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.getVal());
        } else {
            System.out.println("No intersection");
        }
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = size(headA);
        int len2 = size(headB);
        int diff = Math.abs(len1 - len2);
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        if(len1 > len2){
            while(diff > 0){
                temp1 = temp1.next;
                diff--;
            }
        }else{
            while(diff > 0){
                temp2 = temp2.next;
                diff--;
            }
        }

        while(temp1 != null){
            if(temp1 == temp2) return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
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
