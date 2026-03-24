package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Single_Number {
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];

        Map<Integer, Integer> freq = new HashMap<>();

        for(int i : nums){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }
        for(int i=0; i<nums.length; i++){
            if(freq.get(nums[i]) == 1){
                return nums[i];
            }
        }
        return -1;
    }
}
