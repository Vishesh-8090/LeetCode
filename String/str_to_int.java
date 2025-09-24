package String;

public class str_to_int {
    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
    }
    public static int myAtoi(String s) {
        if(s == null || s.length() == 0) return 0;
        s = s.trim();
        long x = 0;
        int sign = 1;
        int i=0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if(i == s.length()){
            return 0;
        }

        if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        else if(s.charAt(i) == '+'){
            i++;
        }

        while(i < s.length() && Character.isDigit(s.charAt(i))) {
            int d = s.charAt(i) - '0';
            x = x*10+d;

            if (sign * x <= min) {
                return min;
            }
            if (sign * x >= max) {
                return max;
            }
            i++;
        }
        return (int)(x*sign);
    }
}
