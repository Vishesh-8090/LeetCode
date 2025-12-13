package Arrays;

import java.util.Arrays;

public class Non_overlapping {
    public static void main(String[] args) {
        int[][] arr = {{1,100},{11,22},{1,11},{2,12}};
        System.out.println(eraseOverlapIntervals(arr));
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b)-> a[1]-b[1]);
        int end = intervals[0][1];
        int count = 0;

        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0] < end){
                count++;
            }
            else{
                end = intervals[i][1];
            }
        }
        return count;
    }
}
