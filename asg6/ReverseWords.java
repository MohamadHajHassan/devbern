package devbern.asg6;

import java.util.Scanner;

public class ReverseWords {
    public static String reverseSingleWord(String str, int startIndex, int endIndex) {
        return new StringBuilder(str.substring(startIndex, endIndex)).reverse().toString();
    }

    public static String reverseWords(String str) {
        StringBuilder strBuilder = new StringBuilder();
        int start = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ',' || ch == '.' || Character.isWhitespace(ch)) {
                strBuilder.append(reverseSingleWord(str, start, i));
                strBuilder.append(ch);
                start = i + 1;
            }
        }
        strBuilder.append(reverseSingleWord(str, start, str.length()));
        return strBuilder.toString();
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            String inputStr = input.nextLine();
            System.out.println(reverseWords(inputStr));
        }
    }
}
