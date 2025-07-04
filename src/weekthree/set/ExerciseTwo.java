package weekthree.set;

import java.util.HashSet;
/*
Pregunta si un número específico está en el set usando contains.
Elimina uno de los números usando remove.
Muestra el set después de eliminarlo.
 */
public class ExerciseTwo {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Set after adding elements: " + numbers);
        System.out.println("Set contains 20: " + numbers.contains(20));
        numbers.remove(30);
        System.out.println("Set after removing 30: " + numbers);
    }
}
