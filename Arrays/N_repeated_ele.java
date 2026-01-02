package Arrays;

import java.util.HashMap;
import java.util.Map;

public class N_repeated_ele {
    public static void main(String[] args) {
        int[] arr = {5,1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(arr));
    }
    public static int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }
        int res = 0;
        for(int i = 0; i<nums.length; i++){
            if(freq.get(nums[i]) > 1){
                res = nums[i];
                break;
            }
        }
        return res;
    }
}
