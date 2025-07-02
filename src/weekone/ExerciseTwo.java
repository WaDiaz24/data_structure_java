package weekone;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = 0, numberTwo= 0;
        boolean validInput = false;

        while (!validInput){
            try {
                System.out.print("Enter first number: ");
                numberOne = scanner.nextInt();
                System.out.print("Enter second number: ");
                numberTwo = scanner.nextInt();
                validInput = true;
             } catch (Exception e) {
                System.out.println("Invalid input. Please enter valid integers.");
                scanner.nextLine();
            }
        }

        int sum = sumNumbers(numberOne, numberTwo);
        System.out.println("The sum of " + numberOne + " and " + numberTwo + " is: " + sum);
        scanner.close();
    }

    public static int sumNumbers(int num1, int num2) {
        return num1 + num2;
    }
}
