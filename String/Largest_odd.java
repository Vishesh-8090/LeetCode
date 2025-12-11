package String;

public class Largest_odd {
    public static void main(String[] args) {
        String s = "783246";
        System.out.println(largestOddNumber(s));
    }
    public static String largestOddNumber(String num) {
        String odd = "";
        for (int i = num.length()-1; i >= 0; i--) {
            int ch = num.charAt(i)-'0';
            if(ch%2 != 0){
                return num.substring(0,i+1);
            }
        }
        return odd;
    }
}
