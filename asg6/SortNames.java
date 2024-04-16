package devbern.asg6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter 10 names: ");
            ArrayList<String> names = new ArrayList<String>();
            for (int i = 0; i < 10; i++) {
                String inputStr = input.nextLine();
                names.add(inputStr);
            }
            String[] namesArray = names.toArray(new String[0]);
            Arrays.sort(namesArray);
            System.out.println("Names sorted alphabetically: ");
            for (String name : namesArray) {
                System.out.print(name + " ");
            }
        }
    }
}