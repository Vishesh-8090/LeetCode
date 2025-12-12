package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Contains_duplicate2 {
    public static void main(String[] args) {
        int[] arr  = {1, 2, 3, 1};
        System.out.println(containsNearbyDuplicate(arr, 2));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> map = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(map.contains(nums[i])) return true;
            map.add(nums[i]);
            if(map.size() > k){
                map.remove(nums[i-k]);
            }
        }
        return false;
    }
}
