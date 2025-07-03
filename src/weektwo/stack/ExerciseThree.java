package weektwo.stack;

import java.util.Stack;
/*
Escribe un método que reciba una palabra y la imprima al revés usando una pila.
 */
public class ExerciseThree {
    public static void main(String[] args) {
        String word = "HelloWorld";
        System.out.println("Original word: " + word);
        wordBackwards(word);
    }

    public static void wordBackwards(String word) {
        Stack<Character> stack = new Stack<>();
        for (char c : word.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversedWord = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedWord.append(stack.pop());
        }
        System.out.println("Reversed word: " + reversedWord);
    }
}
