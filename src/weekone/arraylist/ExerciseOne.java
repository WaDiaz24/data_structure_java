package weekone.arraylist;
/*
Crea un ArrayList<String> con al menos 5 nombres. Imprímelos.
 */
import java.util.ArrayList;

public class ExerciseOne {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");
        names.add("Ethan");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
