package Arrays;

import java.util.Arrays;

public class move_zeros {
    public static void main(String[] args) {
        int[] arr= {4,0,5,0,3,0,1};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int l = 0, r = 0;
        int c = 0;

        while(r < n){
            if(nums[r] == 0){
                c++;
                r++;
            }
            else{
                nums[l] = nums[r];
                l++;
                r++;
            }
        }
        for(int i=n-1; c>0; i--){
            nums[i] = 0;
            c--;
        }
    }
}
