package String;

public class Longest_prefix {
    public static void main(String[] args) {
        String[] s = {"ab","a"};
        System.out.println(longestCommonPrefix(s));
    }
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int shortest = strs[0].length();
        for(int i=1; i<strs.length; i++){
            if(shortest > strs[i].length()) {
                shortest = strs[i].length();
                prefix = strs[i];
            }
        }
        for(int i=0; i<strs.length; i++){
            String str = strs[i];
            for(int j=0; j<shortest;){
                if(str.charAt(j) != prefix.charAt(j)){
                    shortest--;
                }else j++;
            }
        }
        if(shortest == 0) return "";
        prefix = prefix.substring(0, shortest);
        return prefix;
    }
}
