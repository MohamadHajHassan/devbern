package devbern.asg6;

import java.util.Scanner;

public class SumAndAverage {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int sum = 0;
            int count = 0;

            while (true) {
                System.out.print("Enter an integer (or a letter to quit): ");
                if (scanner.hasNextInt()) {
                    int inputInt = scanner.nextInt();
                    sum += inputInt;
                    count++;
                } else {
                    scanner.nextLine();
                    break;
                }
            }

            if (count > 0) {
                double average = (double) sum / count;
                System.out.println("Sum: " + sum);
                System.out.println("Average: " + average);
            }
        }
    }
}
