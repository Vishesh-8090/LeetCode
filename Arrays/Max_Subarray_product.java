package Arrays;

public class Max_Subarray_product {
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        int[] arr = {-3};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums) {
        if(nums.length == 1) return nums[0];

        int prefix = 1;
        int sufix = 1;
        int currmax = 0;
        int currmin = 0;

        int i=0;int j=nums.length-1;
        while (i<nums.length){
            prefix *= nums[i];
            sufix *= nums[j];
            currmax = Math.max(prefix, currmax);
            currmin = Math.max(sufix, currmin);

            if(prefix == 0) prefix = 1;
            if (sufix == 0) sufix = 1;
            i++;
            j--;
        }
        max = Math.max(currmax, currmin);
        return max;
    }
}
