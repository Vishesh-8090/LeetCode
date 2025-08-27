package LinkedList;

public class add_two_nums {
    public static void main(String[] args) {
        ListNode l1 = new ListNode();
//        l1.insertf(1);
        l1.insertf(7);
        l1.insertf(3);

        ListNode l2 = new ListNode();
        l2.insertf(2);
        l2.insertf(9);
//        l2.insertf(6);
//        l2.insertf(5);

        addTwoNumbers(l1.getHead(), l2.getHead());
        l2.display();

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int s1 = size(l1);
        int s2 = size(l2);
        if(s1 > s2){
            int n = 0;
            ListNode temp = l1;
            ListNode temp2 = l2;
            while(temp != null && temp2 != null){
                int sum = temp.getVal() + temp2.getVal() + n;

                if(sum > 10){
                    temp.setVal((sum % 10));
                    n = 1;
                }
                else if(sum == 10){
                    temp.setVal(0);
                    n = 1;
                }
                else{
                    temp.setVal(sum);
                    n = 0;
                }
                if(temp.next == null && n == 1){
                    temp.next = new ListNode(1);
                    temp = temp.next.next;
                    break;
                }
                temp = temp.next;
                temp2 = temp2.next;
            }
            while(temp != null){
                int s = temp.getVal() + n;
                if(s == 10){
                    temp.setVal(0);
                    n = 1;
                }else {
                    temp.setVal(s);
                    n = 0;
                }
                if(temp.next == null && n == 1){
                    temp.next = new ListNode(1);
                    break;
                }
                temp = temp.next;
            }
            return l1;
        }
        int n = 0;
        ListNode temp = l1;
        ListNode temp2 = l2;
        while(temp != null && temp2 != null){
            int sum = temp.getVal() + temp2.getVal() + n;

            if(sum > 10){
                temp2.setVal((sum % 10));
                n = 1;
            }
            else if(sum == 10){
                temp2.setVal(0);
                n = 1;
            }
            else{
                temp2.setVal(sum);
                n = 0;
            }
            if(temp2.next == null && n == 1){
                temp2.next = new ListNode(1);
                temp2 = temp2.next.next;
                break;
            }
            temp = temp.next;
            temp2 = temp2.next;
        }
        while(temp2 != null){
            int s = temp2.getVal() + n;
            if(s == 10){
                temp2.setVal(0);
                n = 1;
            }
            else{
                temp2.setVal(s);
                n = 0;
            }

            if(temp2.next == null && n == 1){
                temp2.next = new ListNode(1);
                break;
            }
            temp2 = temp2.next;
        }
        return l2;
    }
    public static int size(ListNode ll){
        int size = 0;
        ListNode temp = ll;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
}
