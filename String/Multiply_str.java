package String;

public class Multiply_str {
    public static void main(String[] args) {
        System.out.println(multiply("987654321", "123456789"));
    }
    public static String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int n1 = num1.length();
        int n2 = num2.length();
        int[] prod = new int[n1+n2];

        for(int i=n1-1; i>=0; i--){
            for(int j=n2-1; j>=0; j--){
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + prod[i+j+1];
                prod[i+j+1] = sum % 10;
                prod[i+j] += sum / 10;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int j : prod) {
            if(!(res.length() == 0 && j == 0)) res.append(j);
        }

        return res.toString();
    }
}
