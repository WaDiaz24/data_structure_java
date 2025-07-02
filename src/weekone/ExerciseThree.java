package weekone;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter your age: ");
                age = scanner.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for age.");
                scanner.nextLine();
            }
        }

        boolean result = isAdult(age);
        if (result) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult.");
        }
    }

    public static boolean isAdult(int age) {
        return age >= 18;
    }
}
