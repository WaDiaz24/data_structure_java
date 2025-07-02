package weekone.arrays;
/*
Escribe un método que reciba un array de String y un texto. Devuelve si existe en el arreglo
 */
public class ExerciseThree {
    public static void main(String[] args) {
        String[] items = {"apple", "banana", "cherry", "date", "elderberry"};

        System.out.println("Array elements:");
        for (String item : items) {
            System.out.println(item);
        }

        String searchItem = "cherry";
        String result = existItemInArray(items, searchItem);
        System.out.println(result);

    }

    public static String existItemInArray(String[] array, String item) {
        for (String element : array) {
            if (element.equals(item)) {
                return "Item found: " + item;
            }
        }
        return "Item not found: " + item;
    }
}
