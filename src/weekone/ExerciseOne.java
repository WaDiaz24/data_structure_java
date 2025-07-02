package weekone;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.print("Write your name: ");
        name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
