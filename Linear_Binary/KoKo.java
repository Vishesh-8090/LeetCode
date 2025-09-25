package Linear_Binary;

public class KoKo {
    public static void main(String[] args) {
        int[] arr= {3,6,7,11};
        System.out.println(minEatingSpeed(arr, 8));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = max_hr(piles);
        while(left < right){
            int mid = left + (right - left)/2;
            if(totaltime(piles, h, mid)){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
    public static int max_hr(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static boolean totaltime(int[] arr, int h, int k){
        long total_hr = 0;
        for(int i=0; i<arr.length; i++){
            total_hr += (arr[i] + k - 1)/k;
        }
        return total_hr <= h;
    }
}
