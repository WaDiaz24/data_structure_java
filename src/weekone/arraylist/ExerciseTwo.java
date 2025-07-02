package weekone.arraylist;
/*
Crea un ArrayList<Integer>, agrega 5 números y elimina el tercero.
 */
import java.util.ArrayList;

public class ExerciseTwo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println("Removing the number 30 from the list...");
        numbers.remove(2);
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
