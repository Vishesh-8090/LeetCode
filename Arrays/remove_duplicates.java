package Arrays;

import java.util.Arrays;

public class remove_duplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j=2; j<nums.length; j++){
            if(nums[i] != nums[j]){
                nums[i+2] = nums[j];
                i++;
            }
        }
        return i+2;
    }
}
