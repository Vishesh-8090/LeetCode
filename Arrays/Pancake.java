package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pancake {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1};
        System.out.println(pancakeSort(arr));
    }
    public static List<Integer> pancakeSort(int[] arr) {
        List<Integer> flips = new ArrayList<>();
        for(int i=arr.length; i>1; --i){
            int j= find(arr, i);
            if(j == i-1) continue;

            if(j != 0){
                flips.add(j+1);
                flip(arr, 0, j);
            }
            flips.add(i);
            flip(arr, 0, i-1);
        }
        return flips;
    }
    public static void flip(int[] arr, int start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static int find(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
