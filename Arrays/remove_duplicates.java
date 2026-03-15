package Arrays;

import java.util.Arrays;

public class remove_duplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int i=0;
        int c = 1;
        for(int j=1; j<nums.length; j++){
            if(nums[i] != nums[j]){
                nums[++i] = nums[j];
                c++;
            }
        }
        return c;
    }
}
