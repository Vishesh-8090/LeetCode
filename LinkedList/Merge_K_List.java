package LinkedList;

import java.util.Arrays;

public class Merge_K_List {
    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        l1.insertf(5);
        l1.insertf(4);
        l1.insertf(1);

        ListNode l2 = new ListNode();
        l2.insertf(4);
        l2.insertf(3);
        l2.insertf(1);

        ListNode l3 = new ListNode();
        l3.insertf(6);
        l3.insertf(2);

        ListNode[] arr = new ListNode[3];
        arr[0] = l1.next;
        arr[1] = l2.next;
        arr[2] = l3.next;

        System.out.println(Arrays.toString(arr));
        ListNode ll = mergeKLists(arr);
        ll.display(ll.getHead());
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;

        return mergesort(lists, 0, lists.length-1);
    }
    public static ListNode mergesort(ListNode[] l1, int left, int right){
        if(left == right) return l1[left];

        int mid = left + (right - left)/2;
        ListNode node1 = mergesort(l1, left, mid);
        ListNode node2 = mergesort(l1, mid+1, right);
        return merge(node1, node2);
    }
    public static ListNode merge(ListNode node1, ListNode node2){
        ListNode temp = new ListNode();
        ListNode k = temp;

        while(node1 != null && node2 != null){
            if(node1.getVal() <= node2.getVal()){
                k.next = node1;
                node1 = node1.next;
            }else{
                k.next = node2;
                node2 = node2.next;
            }
            k = k.next;
        }

        if(node1 != null) k.next = node1;
        if(node2 != null) k.next = node2;

        return temp.next;
    }
}
