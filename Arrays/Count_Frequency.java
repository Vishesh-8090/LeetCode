package Arrays;

public class Count_Frequency {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(arr));
    }
    public static int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int max = 0;

        for (int i : nums) {
            freq[i]++;
            max = Math.max(max, freq[i]);
        }

        int res = 0;
        for (int i : freq) {
            if(i == max) res += i;
        }
        return res;
    }
}
