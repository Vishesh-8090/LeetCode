package Arrays;

public class third_max {
    public static void main(String[] args) {
        int[] arr = {1,2,-2147483648};
        System.out.println(thirdMax(arr));
    }
    public static int thirdMax(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(max1 < nums[i]){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }
            else if((max2 < nums[i]) && (nums[i] != max1)){
                max3 = max2;
                max2 = nums[i];
            }
            else if((max3 <= nums[i]) && (nums[i] != max1 && nums[i] != max2)){
                max3 = nums[i];
            }
        }
        return (max3 == Integer.MIN_VALUE) ? max1 : max3;
    }
}
