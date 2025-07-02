package weekone.arraylist;

import java.util.ArrayList;
/*
Imprime los elementos de un ArrayList en orden inverso (usa for de forma descendente).
 */

public class ExerciseFive {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (int i = numbers.size()-1; i >= 0; i--){
            System.out.println(numbers.get(i));
        }
    }
}
