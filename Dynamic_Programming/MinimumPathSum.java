package Dynamic_Programming;

import java.util.Arrays;

public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int[][] dp = new int[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(helper(grid, grid.length-1, grid[0].length-1, dp)); 
    }
    private static int helper(int[][] grid, int m, int n, int[][] dp){
        if(m == 0 && n == 0) return grid[0][0];
        if(m < 0 || n < 0) return 10000000;

        if(dp[m][n] != -1) return dp[m][n];

        int up = grid[m][n] + helper(grid, m-1, n, dp);
        int left = grid[m][n] + helper(grid, m, n-1, dp);

        return dp[m][n] = Math.min(up, left);
    }
}
