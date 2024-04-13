package devbern.asg6;

import java.util.Scanner;

public class LettersOccurrences {
    public static int[] countLetters(String word) {
        int[] occurrences = new int[26]; // 26 letters in the english alphabet
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (Character.isLetter(letter)) {
                // decrementing the ASCII value of the letter 'a' from the ASCII value of the
                // letter 'letter' will give the index of the letter in the array
                occurrences[Character.toLowerCase(letter) - 'a']++;
            }
        }
        return occurrences;
    }

    public static char letterWithMaximumOccurrences(int[] occurrences) {
        int max = 0;
        char letter = 'a';
        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] > max) {
                max = occurrences[i];
                letter = (char) (i + 'a');
            }
        }
        return letter;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            String str = input.nextLine();
            int[] occurrences = countLetters(str);
            // display all the letters and their occurrences
            for (int i = 0; i < occurrences.length; i++) {
                if (occurrences[i] > 0) {
                    System.out.println((char) (i + 'a') + ": " + occurrences[i]);
                }
            }

            char letter = letterWithMaximumOccurrences(occurrences);
            // display the letter that occurs the most
            System.out.println("The letter that occurs the most is: " + letter);
        }
    }
}
