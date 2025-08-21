package LinkedList;
public class Mergetwolist {
        public static void main(String[] args) {
            ListNode l1 = new ListNode();
            l1.insertf(3);
            l1.insertf(-9);

            ListNode l2 = new ListNode();
            l2.insertf(7);
            l2.insertf(5);

            l1.display();
            l2.display();

            ListNode res = new ListNode();
            System.out.println(mergeTwoLists(l1.getHead(), l2.getHead(), res));
            res.display();
        }

        public static ListNode mergeTwoLists(ListNode list1, ListNode list2, ListNode res) {
            ListNode k = res;

            while (list1 != null && list2 != null) {
                if (list1.getVal() <= list2.getVal()) {
                    k.next = list1;
                    list1 = list1.next;
                } else {
                    k.next = list2;
                    list2 = list2.next;
                }
                k = k.next;
            }
            if (list1 != null) {
                k.next = list1;
            }
            if (list2 != null) {
                k.next = list2;
            }
            return res.next;
        }
}