package Arrays;

import java.util.Arrays;

public class Rearrange_array {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
    public static int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int i=0;
        int j=1;

        for (int k = 0; k < res.length; k++) {
            if(nums[k] > 0) {
                res[i] = nums[k];
                i += 2;
            }else{
                res[j] = nums[k];
                j += 2;
            }
        }
        return res;
    }
}
