package weektwo.stack;

import java.util.Stack;
/*
Escribe un método que reciba un string con paréntesis (), y diga si están balanceados.
Ejemplo: "(()())" → ✅, "(()" → ❌
(Hint: usar Stack<Character>)
 */

public class ExerciseTwo {
    public static void main(String[] args) {
        String expr1 = "(()())";
        String expr2 = "(()";

        System.out.println("Expression: " + expr1 + " is balanced: " + stringWithParentheses(expr1));
        System.out.println("Expression: " + expr2 + " is balanced: " + stringWithParentheses(expr2));
    }

    public static boolean stringWithParentheses(String str) {
        Stack<Character> expressions = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                expressions.push(c);
            } else if (c == ')') {
                if (expressions.isEmpty()) {
                    return false; // More closing parentheses than opening ones
                }
                expressions.pop();
            }
        }
        return expressions.isEmpty(); // If stack is empty, parentheses are balanced
    }
}
