package weekthree.set;

import java.util.HashSet;
/*
Crea dos HashSet<String> con colores.
Une ambos sets en uno solo.
Imprime el resultado.
 */
public class ExerciseThree {
    public static void main(String[] args) {
        HashSet<String> colorsOne = new HashSet<>();
        HashSet<String> colorsTwo = new HashSet<>();
        HashSet<String> colors = new HashSet<>();

        colorsOne.add("Red");
        colorsOne.add("Green");

        colorsTwo.add("Blue");
        colorsTwo.add("Red");

        // Add all elements from colorsOne and colorsTwo to colors
        colors.addAll(colorsOne);
        colors.addAll(colorsTwo);
        // Print the combined set
        System.out.println("Combined Set: " + colors);
    }
}
