package Arrays;

import java.util.Arrays;

public class Range_Sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(rangeSum(arr, arr.length,1,5));
    }
    public static int rangeSum(int[] nums, int n, int left, int right) {
        int total = (n * (n + 1))/2;
        int[] sums = new int[total];
        int k = 0;

        for(int i=0; i<n; i++){
            int prefix = 0;
            for(int j=i; j<n; j++){
                prefix += nums[j];
                sums[k++] = prefix;
            }
        }
        Arrays.sort(sums);
        int ans = 0;
        int mod = 1000000007;
        for(int i=left-1; i<right; i++){
            ans = (ans + sums[i]) % mod;
        }
        return ans;
    }
}
