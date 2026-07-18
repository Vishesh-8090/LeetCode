package Dynamic_Programming;

import java.util.Arrays;

public class ClimbStairs {
    public static void main(String[] args) {
        int n = 45;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(climb(dp, n));
    }
    private static int climb(int[] dp, int n){
        if(n == 0) return 1;
        if(n == 1) return 1;

        if (dp[n] != -1) return dp[n];

        return dp[n] = climb(dp, n-1) + climb(dp, n-2);
    }
}
