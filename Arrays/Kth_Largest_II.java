package Arrays;

import java.util.Arrays;

public class Kth_Largest_II {
    public static void main(String[] args) {
        String[] nums = {"3","6","7","10"};
        int k = 4;
        System.out.println(kthLargestNumber(nums, k));
    }
    public static String kthLargestNumber(String[] nums, int k){
        Arrays.sort(nums, (a, b) -> {
            if (a.length() != b.length()){
                return Integer.compare(a.length(), b.length());
            }
            else {
                return a.compareTo(b);
            }
        });
        return nums[nums.length - k];
    }
}
