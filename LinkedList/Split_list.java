package LinkedList;

public class Split_list {
    public static void main(String[] args) {
        ListNode ll = new ListNode();
        ll.insertf(10);
        ll.insertf(9);
        ll.insertf(8);
        ll.insertf(7);
        ll.insertf(6);
        ll.insertf(5);
        ll.insertf(4);
        ll.insertf(3);
        ll.insertf(2);
        ll.insertf(1);

        ListNode[] arr = splitListToParts(ll.getHead(), 3);
        for (ListNode node : arr) {
            node.display(node);
        }
    }
    public static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];

        if(head == null) return res;
        int len = size(head);
        ListNode node = head;

        if(len > k && len%k == 0){
            for(int i=0 ; i<k; i++){
                ListNode temp = node;
                for(int j=1; j<len/k; j++){
                    node = node.next;
                }
                temp = node;
                node = node.next;
                temp.next = null;
                res[i] = head;
                head = node;
            }
        }
        else if(len < k){
            for(int i=0; i<len; i++){
                node = node.next;
                head.next = null;
                res[i] = head;
                head = node;
            }
        }
        else{
            int first = len%k;
            for(int i=0 ; i<k; i++){
                ListNode temp = node;
                if(first != 0){
                    for(int j=0; j<len/k; j++){
                        node = node.next;
                    }
                    temp = node;
                    node = node.next;
                    temp.next = null;
                    res[i] = head;
                    head = node;
                    first--;
                }
                else{
                    for(int j=1; j<len/k; j++){
                        node = node.next;
                    }
                    temp = node;
                    node = node.next;
                    temp.next = null;
                    res[i] = head;
                    head = node;
                }
            }
        }
        return res;
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
