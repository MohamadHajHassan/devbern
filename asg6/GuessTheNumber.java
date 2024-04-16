package devbern.asg6;

import java.util.Scanner;

public class GuessTheNumber {
    public static int generateRandomNumberBetween1And54() {
        int result = (int) (Math.random() * 54);
        return result + 1;
    }

    public static void guessTheNumber(int number) {
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("Guess the number(1 to 54): ");
            while (true) {
                int inputInt = userInput.nextInt();
                if (inputInt < number) {
                    System.out.println("Oops your guess is smaller");
                } else if (inputInt > number) {
                    System.out.println("Oops your guess is bigger");
                } else {
                    System.out.println("You guessed it right!");
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        guessTheNumber(generateRandomNumberBetween1And54());
    }
}
