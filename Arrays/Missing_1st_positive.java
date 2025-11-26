package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Missing_1st_positive {
    public static void main(String[] args) {
        int arr[] = {-3,9,16,4,5,16,-4,9,26,2,1,19,-1,25,7,22,2,-7,14,2,5,-6,1,17,3,24,-4,17,15};
        System.out.println(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]) || nums[i] < 0){
                continue;
            }else{
                map.put(nums[i], i);
            }
            if(nums[i] > max) max = nums[i];
        }
        int i = 1;

        for(i=1; i<=max; i++){
            if(!map.containsKey(i)) {
                break;
            }
        }
        if(i == max) return i+1;
        return i;
    }
}
