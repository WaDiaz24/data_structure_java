package weekthree.set;

import java.util.HashSet;
/*
Crea un HashSet<Integer>.
Agrega varios números, incluyendo algunos duplicados.
Imprime los elementos. Asegúrate de que no se repitan.
 */
public class ExerciseOne {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);

        System.out.println("Numbers in the set: " + numbers);
    }
}
