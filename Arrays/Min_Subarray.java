package Arrays;

public class Min_Subarray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, arr));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int minlen = Integer.MAX_VALUE;
        int left = 0;
        int curr_sum = 0;

        for (int right = 0; right < nums.length; right++) {
            curr_sum += nums[right];
            while(curr_sum >= target){
                if(right - left + 1 < minlen){
                    minlen = right - left + 1;
                }
                curr_sum -= nums[left];
                left++;
            }
        }
        return minlen != Integer.MAX_VALUE ? minlen : 0;
    }
}
