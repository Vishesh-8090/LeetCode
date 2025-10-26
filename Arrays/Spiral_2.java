package Arrays;

public class Spiral_2 {
    public static void main(String[] args) {
        int[][] res = generateMatrix(3);
        for (int[] arr : res) {
            System.out.print("[");
            for (int ele : arr) {
                System.out.print(ele+",");
            }
            System.out.println("]");
        }
    }
    public static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int top = 0;
        int down = n-1;
        int left = 0;
        int right = n-1;
        int count = 1;

        while(top <= down && left <= right){
            for(int i=left; i<=right; i++){
                arr[top][i] = count++;
            }
            top++;
            for(int i=top; i<=down; i++){
                arr[i][right] = count++;
            }
            right--;
            if(top <= down){
                for(int i=right; i>=left; i--){
                    arr[down][i] = count++;
                }
                down--;
            }
            if(left <= right){
                for(int i=down; i>=top; i--){
                    arr[i][left] = count++;
                }
                left++;
            }
        }
        return arr;
    }
}
