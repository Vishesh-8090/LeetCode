package String;

public class First_occurrence {
    public static void main(String[] args) {
        String s = "mississippi";
        String s1 = "";
        System.out.println(strStr(s, s1));
    }
    public static int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()) return -1;
        if(needle.length() == 0) return 0;
        return haystack.indexOf(needle);
    }
}
