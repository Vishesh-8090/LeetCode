package LinkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LL_Components {
    public static void main(String[] args) {
        ListNode ll = new ListNode();
        ll.insertf(1);
        ll.insertf(2);
        ll.insertf(0);
        ll.insertf(4);
        ll.insertf(3);

        int[] num = {4};
        System.out.println(numComponents(ll.getHead(), num));
    }
    public static int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int count = 0;
        ListNode temp = head;
        int s = -1;

        while(temp != null){
            if(set.contains(temp.getVal())){
                if(s == -1){
                    count++;
                    s = 1;
                }
            }
            else {
                s = -1;
            }
            temp = temp.next;
        }
        return count;
    }
}
