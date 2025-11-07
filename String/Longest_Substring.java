package String;

import java.util.HashMap;
import java.util.Map;

public class Longest_Substring {
    public static void main(String[] args) {
        String s = "dvdk";

        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;

        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int max = 0;

        for(int j=0; j<s.length(); j++){
            char ch = s.charAt(j);

            if(map.containsKey(ch)){
                i = Math.max(i, map.get(ch)+1);
            }
            map.put(ch, j);
            max = Math.max(max, j-i+1);
        }
        return max;
    }
}
