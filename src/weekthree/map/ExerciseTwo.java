package weekthree.map;

import java.util.HashMap;
/*
Pregunta si existe una palabra específica con containsKey().
Si existe, imprime su capital.
Si no, muestra un mensaje de "palabra no encontrada".
Elimina una palabra del diccionario usando remove().
Muestra el mapa actualizado.
 */

public class ExerciseTwo {
    public static void main(String[] args) {
        HashMap<String, String> countryCapitals = new HashMap<>();

        countryCapitals.put("USA", "Washington, D.C.");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("Germany", "Berlin");
        countryCapitals.put("Italy", "Rome");

        if (countryCapitals.containsKey("France")) {
            System.out.println("The capital of France is: " + countryCapitals.get("France"));
        } else {
            System.out.println("Country not found.");
        }

        countryCapitals.remove("Germany");
        System.out.println("After removing Germany:");
        System.out.println(countryCapitals);
    }
}
