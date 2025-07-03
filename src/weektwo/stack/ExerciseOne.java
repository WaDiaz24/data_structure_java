package weektwo.stack;

import java.util.Stack;
/*
Lifo
Crea una pila con títulos de libros (String). Agrega 5 libros, muestra el tope y elimina 2.
 */

public class ExerciseOne {
    public static void main(String[] args) {
        Stack<String> bookTitles = new Stack<>();
        bookTitles.push("The Great Gatsby");
        bookTitles.push("To Kill a Mockingbird");
        bookTitles.push("1984");
        bookTitles.push("Pride and Prejudice");
        bookTitles.push("The Catcher in the Rye");

        System.out.println("Top element: " + bookTitles.peek());
        System.out.println("Delete element: " + bookTitles.pop());
        System.out.println("Delete element: " + bookTitles.pop());
        System.out.println("Remaining books in stack: " + bookTitles);
    }
}
