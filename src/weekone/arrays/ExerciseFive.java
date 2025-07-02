package weekone.arrays;
/*
Crea un método que imprima los elementos del arreglo en orden inverso.
 */
public class ExerciseFive {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        printArrayInReverse(numbers);
    }

    public static void printArrayInReverse(int[] array) {
        System.out.println("Array elements in reverse order:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
