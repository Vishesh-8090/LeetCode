package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Majority_ele_2 {
    public static void main(String[] args) {
        int[] arr = {8, 8, 7, 7, 7};
        System.out.println(majorityElement(arr));
    }
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length/3;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> res = new ArrayList<>();

        for (int i=0; i<nums.length; i++){
            if (!res.contains(nums[i]) && map.get(nums[i]) > n){
                res.add(nums[i]);
            }else {
                continue;
            }
        }
        return res;
    }
}
