package Dynamic_Programming;

import java.util.Arrays;

public class Chocolate_Pickup {
    public static void main(String[] args) {
        int r = 3, c = 4;
        int[][] grid = {{2, 3, 1, 2}, 
                        {3, 4, 2, 2}, 
                        {5, 6, 3, 5}};

        int[][][] dp = new int[r][c][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				Arrays.fill(dp[i][j], -1);
			}
		}

        System.out.println(helper(r, c, 0, 0, c-1, grid, dp));
    }
    public static int helper(int r, int c, int m, int n1, int n2, int[][] grid, int[][][] dp){
		if(m == r) return 0;
		if(n1 >= c || n1 < 0 || n2 >= c || n2 < 0) return 0;

		if(dp[m][n1][n2] != -1) return dp[m][n1][n2];

		int current;

		if(n1 == n2) {
			current = grid[m][n1];
		}
		else{
			current = grid[m][n1] + grid[m][n2];
		}

		int option1 = current + helper(r, c, m+1, n1, n2, grid, dp);
		int option2 = current + helper(r, c, m+1, n1-1, n2, grid, dp);
		int option3 = current + helper(r, c, m+1, n1+1, n2, grid, dp);

		int max1 = Math.max(option1, Math.max(option2, option3));

		int option4 = current + helper(r, c, m+1, n1, n2-1, grid, dp);
		int option5 = current + helper(r, c, m+1, n1-1, n2-1, grid, dp);
		int option6 = current + helper(r, c, m+1, n1+1, n2-1, grid, dp);

		int max2 = Math.max(max1, Math.max(option4, Math.max(option5, option6)));

		int option7 = current + helper(r, c, m+1, n1, n2+1, grid, dp);
		int option8 = current + helper(r, c, m+1, n1-1, n2+1, grid, dp);
		int option9 = current + helper(r, c, m+1, n1+1, n2+1, grid, dp);

		return dp[m][n1][n2] = Math.max(max2, Math.max(option7, Math.max(option8, option9)));
	}
}
