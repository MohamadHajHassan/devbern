package devbern.asg6;

import java.util.Scanner;

public class ReplacePalindromeSubstrings {
    public static String replacePalindrome(String str) {
        StringBuilder strBuilder = new StringBuilder();
        int start = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ',' || ch == '.' || Character.isWhitespace(ch)) {
                if (PalindromeCheck.isPalindrome(str.substring(start, i))) {
                    for (int j = 0; j < i - start; j++) {
                        strBuilder.append('*');
                    }
                } else {
                    strBuilder.append(str.substring(start, i));
                }
                strBuilder.append(ch);
                start = i + 1;
            } else if (i == str.length() - 1) {
                if (PalindromeCheck.isPalindrome(str.substring(start))) {
                    for (int j = 0; j < i - start + 1; j++) {
                        strBuilder.append('*');
                    }
                } else {
                    strBuilder.append(str.substring(start));
                }
            }

        }
        return strBuilder.toString();
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            String inputStr = input.nextLine();
            System.out.println(replacePalindrome(inputStr));
        }
    }
}
