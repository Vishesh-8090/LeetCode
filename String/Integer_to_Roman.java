package String;

public class Integer_to_Roman {
    public static void main(String[] args) {
        int n = 58;
        System.out.println(intToRoman(n));
    }
    public static String intToRoman(int num) {
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String result = "";

        for(int i=0; i<val.length; i++){
            if(num == 0) break;
            while(num >= val[i]){
                result += roman[i];
                num -= val[i];
            }
        }
        return result;
    }
}
