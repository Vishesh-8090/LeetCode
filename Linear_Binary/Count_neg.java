package Linear_Binary;

public class Count_neg {
    public static void main(String[] args) {
        int[][] arr = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        System.out.println(countNegatives(arr));
    }
    public static int countNegatives(int[][] grid) {
        int row = grid.length-1;
        int col = 0;
        int count = 0;

        while(row >= 0 && col < grid[0].length){
            int mid = grid[row][col];
            if(mid < 0){
                count += grid[0].length - col;
                row--;
            }
            if(mid >= 0){
                col++;
            }
        }
        return count;
    }
}
