package Dynamic_Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(new ArrayList<>(Arrays.asList(2)));
        triangle.add(new ArrayList<>(Arrays.asList(3, 4)));
        triangle.add(new ArrayList<>(Arrays.asList(6, 5, 7)));
        triangle.add(new ArrayList<>(Arrays.asList(4, 1, 8, 3)));

        int[][] dp = new int[triangle.size()][triangle.size()];
        for(int[] row : dp){
            Arrays.fill(row, -100001);
        }
        System.out.println(helper(triangle, 0, 0, dp)); 
    }
    private static int helper(List<List<Integer>> triangle, int m, int n, int[][] dp){
        if(m == triangle.size()-1) return triangle.get(m).get(n);
        
        if(dp[m][n] != -100001) return dp[m][n];

        int down = triangle.get(m).get(n) + helper(triangle, m+1, n, dp);
        int diagonal = triangle.get(m).get(n) + helper(triangle, m+1, n+1, dp);

        return dp[m][n] = Math.min(down, diagonal);
    }
}
