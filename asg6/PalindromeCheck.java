package devbern.asg6;

import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        if (str.length() < 2) {
            return true;
        }
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            String str = input.nextLine();
            System.out.println(isPalindrome(str));
        }
    }
}
