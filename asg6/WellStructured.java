package devbern.asg6;

import java.util.Stack;

public class WellStructured {
    public static boolean isWellStructured(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            }

            if (str.charAt(i) == '}') {
                if (stack.isEmpty() || stack.getLast() != '{') {
                    return false;
                } else {
                    stack.pop();
                    continue;
                }

            } else if (str.charAt(i) == ']') {
                if (stack.isEmpty() || stack.getLast() != '[') {
                    return false;
                } else {
                    stack.pop();
                    continue;
                }

            } else if (str.charAt(i) == ')') {
                if (stack.isEmpty() || stack.getLast() != '(') {
                    return false;
                } else {
                    stack.pop();
                    continue;
                }
            }

        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "{[](([]))}";
        String str1 = "{";
        String str2 = ")";
        String str3 = "[](){}]";

        System.out.println(isWellStructured(str));
        System.out.println(isWellStructured(str1));
        System.out.println(isWellStructured(str2));
        System.out.println(isWellStructured(str3));
    }
}
