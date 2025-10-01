package LinkedList;

public class Merge_in_Between {
    public static void main(String[] args) {
        ListNode ll = new ListNode();
        ll.insertf(5);
        ll.insertf(9);
        ll.insertf(6);
        ll.insertf(13);
        ll.insertf(1);
        ll.insertf(10);
        ll.display(ll.getHead());

        ListNode l2= new ListNode();
        l2.insertf(1003);
        l2.insertf(1002);
        l2.insertf(1000);
        l2.display(l2.getHead());

        ListNode l3 = mergeInBetween(ll.getHead(),3,4,l2.getHead());
        l3.display(l3);
    }
    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        int i = 1;
        while(i < a){
            temp = temp.next;
            i++;
        }

        ListNode temp2 = list1;
        int j = 0;
        while(j <= b){
            temp2 = temp2.next;
            j++;
        }

        ListNode node = list2;
        while(node.next != null){
            node = node.next;
        }
        temp.next = list2;
        node.next = temp2;
        return list1;
    }
}
