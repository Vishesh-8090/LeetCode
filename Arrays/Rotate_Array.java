package Arrays;

import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n == 1 || n == k) return;
        k = k%n;

        int[] arr = new int[k];
        int t = 0;
        for(int i=n-k; i<n; i++){
            arr[t] = nums[i];
            t++;
        }
        int l = n-k-1;
        for(int i=n-1; i>=k; i--){
            nums[i] = nums[l];
            l--;
        }
        System.arraycopy(arr, 0, nums, 0, k);
    }
}
