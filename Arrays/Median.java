package Arrays;

public class Median {
    public static void main(String[] args) {
        int[] n1 = {2,5,8,9,17};
        int[] n2 = {3,4,7,15,36};
        System.out.println(findMedianSortedArrays(n1, n2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = merge(nums1, nums2);
        int len = arr.length;
        int n = len/2;

        if(len%2 == 0){
            return (double)(arr[n] + arr[n-1])/2;
        }
        return arr[n];
    }
    public static int[] merge(int[] nums1, int[] nums2){
        int[] mix = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                mix[k] = nums1[i];
                i++;
            }
            else{
                mix[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < nums1.length){
            mix[k] = nums1[i];
            i++;
            k++;
        }
        while(j < nums2.length){
            mix[k] = nums2[j];
            j++;
            k++;
        }
        return mix;
    }
}
