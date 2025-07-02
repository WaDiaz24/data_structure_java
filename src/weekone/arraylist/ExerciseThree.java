package weekone.arraylist;

import java.util.ArrayList;
/*
Escribe un método que reciba una lista de nombres y un nombre a buscar. Devuelve si existe.
 */

public class ExerciseThree {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");

        String nameToSearch = "Charlie";
        searchName(names, nameToSearch);
    }

    public static void searchName(ArrayList<String> names, String nameToSearch) {
        if (names.contains(nameToSearch)) {
            System.out.println("The name " + nameToSearch + " is in the list.");
        } else {
            System.out.println("The name " + nameToSearch + " is not in the list.");
        }
    }
}
