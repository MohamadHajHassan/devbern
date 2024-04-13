package devbern.asg6;

import java.util.Scanner;

public class ContainsE {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a word to check if it has the letter 'e': ");
            String word = input.nextLine();
            if (word.contains("e")) {
                System.out.println("The word contains the letter 'e'");
            } else {
                System.out.println("The word does not contain the letter 'e'");
            }
        }
    }
}
