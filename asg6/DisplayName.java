package devbern.asg6;

import java.util.Scanner;

public class DisplayName {
    public static void main(String[] args) {
        try (Scanner inputName = new Scanner(System.in)) {
            System.out.println("Enter your first name: ");
            String firstName = inputName.nextLine();
            System.out.println("Enter your middle name: ");
            String middleName = inputName.nextLine();
            System.out.println("Enter your last name: ");
            String lastName = inputName.nextLine();
            System.out.println(firstName.charAt(0) + ". " + middleName.charAt(0) + ". " + lastName);
        }
    }
}
