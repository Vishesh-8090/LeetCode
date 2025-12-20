package String;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Frequency_sort {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
    public static String frequencySort(String s) {
        if (s.length() == 1) return s;
        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        StringBuilder res = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : list) {
            int c = entry.getValue();
            char x = entry.getKey();
            res.append(String.valueOf(x).repeat(c));
        }

        return res.toString();
    }
}
