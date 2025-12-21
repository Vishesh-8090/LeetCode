package String;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        System.out.println(isIsomorphic(s, t));
    }
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> freq_s = new HashMap<>();
        Map<Character, Character> freq_t = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq_s.containsKey(ch) && freq_s.get(ch) != t.charAt(i)){
                return false;
            }
            freq_s.put(ch, t.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (freq_t.containsKey(ch) && freq_t.get(ch) != s.charAt(i)){
                return false;
            }
            freq_t.put(ch, s.charAt(i));
        }
        return true;
    }
}
