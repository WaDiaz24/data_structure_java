package weekthree.map;

import java.util.HashMap;
/*
Crea un HashMap<String, String> para almacenar palabras en inglés y su traducción al español.
Agrega al menos 5 pares.
Imprime todas las palabras con sus traducciones.
 */

public class ExerciseOne {
    public static void main(String[] args) {
        HashMap<String, String> wordsInEnglish = new HashMap<>();

        wordsInEnglish.put("Hello", "Hola");
        wordsInEnglish.put("Goodbye", "Adiós");
        wordsInEnglish.put("Please", "Por favor");
        wordsInEnglish.put("Thank you", "Gracias");
        wordsInEnglish.put("Yes", "Sí");

        System.out.println(wordsInEnglish);

        // Print the English words and their Spanish translations
        System.out.println("English to Spanish Translations:");
        for (String englishWord : wordsInEnglish.keySet()) {
            String spanishTranslation = wordsInEnglish.get(englishWord);
            System.out.println(englishWord + " -> " + spanishTranslation);
        }
    }
}
