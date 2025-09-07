package Arrays;

public class Most_Water {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int n = height.length;
        int i = 0;
        int j = n-1;
        int cap = 0;

        while(i < j){
            int min_len = Math.min(height[i], height[j]);
            cap = Math.max(cap, (j-i)*min_len);

            if(height[i] <= height[j]){
                i++;
            }
            else if(height[i] > height[j]){
                j--;
            }
        }
        System.out.println(cap);
    }
}
