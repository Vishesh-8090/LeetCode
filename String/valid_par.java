package String;

import java.util.Stack;

public class valid_par {
    public static void main(String[] args) {
        String s = "(])";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        if(s.length() == 1) return false;
        Stack<Character> res = new Stack<>();

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{'){
                res.push(ch);
            }
            else{
                if (res.isEmpty()) return false;
                char top = res.pop();
                if (ch == ')' && top == '(') return false;
                if (ch == ']' && top == '[') return false;
                if (ch == '}' && top == '{') return false;
            }
        }
        return res.isEmpty();
    }
}
