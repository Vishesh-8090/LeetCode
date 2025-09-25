package Linear_Binary;

import java.util.Arrays;

public class Smallest_kth_Pair {
    public static void main(String[] args) {
        int[] nums = {1,5,9,6,4,2};
        int k = 5;

        System.out.println(smallestDistancePair(nums, k));
    }
    public static int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int max = nums[nums.length-1]-nums[0];
        int left = 0;

        while(left < max){
            int mid = left + (max - left)/2;
            if(countPairs(nums, mid, k)){
                max = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
    public static boolean countPairs(int[] nums, int mid, int k){
        int c = 0, i=0, j=0;
        while(i<nums.length || j<nums.length){
            while(j < nums.length && nums[j]-nums[i] <= mid){
                j++;
            }
            c += j-i-1;
            i++;
        }
        return c >= k;
    }
}
