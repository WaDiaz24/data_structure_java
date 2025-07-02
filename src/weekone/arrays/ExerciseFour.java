package weekone.arrays;

/*
Escribe un método que reciba un array de enteros y devuelva el valor máximo y mínimo.
 */
public class ExerciseFour {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 8, 2};

        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + ", ");
        }
        findMaxAndMin(numbers);
    }

    public static void findMaxAndMin(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println();
        System.out.println("Max: " + max + ", Min: " + min);
    }
}
