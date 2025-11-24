package Arrays;

public class Four_divisors {
    public static void main(String[] args) {
        int[] arr = {21, 4, 7};
        System.out.println(sumFourDivisors(arr));
//        System.out.println(Math.sqrt(21));
    }
    public static int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            int j = 2;
            int count = 0;
            int s = 1;
            while(j*j <= n){
                if(n%j == 0){
                    int j2 = n/j;
                    if(j == j2){
                        count++;
                        s += j;
                    }
                    else{
                        count += 2;
                        s += j + j2;
                    }
                    if(count > 2) break;
                }
                j++;
            }
            if(count == 2) sum = sum + s + nums[i];
        }
        return sum;
    }
}
