package weekone.arraylist;

import java.util.ArrayList;
/*
Reemplaza el segundo elemento de una lista por otro valor.
 */
public class ExerciseFour {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        fruits.set(1, "Blueberry");
        System.out.println("After updating:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
