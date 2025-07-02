package weekone.arrays;
/*
Crea un método que reciba un array de enteros y devuelva la suma total.
 */
public class ExerciseTwo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Sum of Array elements:");
        System.out.println("The sum is " + sumArray(numbers));
    }

    public static int sumArray(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }
}
