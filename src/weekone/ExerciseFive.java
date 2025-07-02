package weekone;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Enter a number: ");
                number = scanner.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
            if (validInput){
                if (number % 2 == 0) {
                    System.out.println("The number " + number + " is pair.");
                } else {
                    System.out.println("The number " + number + " is not pair.");
                }
                scanner.close();
            }
        }
    }
}
