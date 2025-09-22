package linear_Binary;

public class D_Days {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(arr, 5));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int left = max(weights);
        int right = 0;
        for(int i=0; i<weights.length; i++){
            right += weights[i];
        }

        while(left < right){
            int mid = left + (right - left)/2;
            if(possible(weights, days, mid)){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
    public static boolean possible(int[] arr, int d, int m){
        int curr_weight = 0;
        int day = 1;
        for(int i=0; i<arr.length; i++){
            if(curr_weight + arr[i] > m){
                day++;
                curr_weight = 0;
            }
            curr_weight += arr[i];
        }
        return day <= d;
    }
    public static int max(int[] arr){
        int max_w = 0;
        for(int i=0; i<arr.length; i++){
            if(max_w < arr[i]){
                max_w = arr[i];
            }
        }
        return max_w;
    }
}
