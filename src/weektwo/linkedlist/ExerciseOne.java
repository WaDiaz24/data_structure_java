package weektwo.linkedlist;
/*
Crea una LinkedList<String> con tareas. Añade tareas al inicio y al final. Imprímelas.
 */

import java.util.LinkedList;

public class ExerciseOne {
    public static void main(String[] args) {
        LinkedList<String> listTasks = new LinkedList<>();

        listTasks.add("Task 1");
        listTasks.add("Task 2");
        listTasks.add("Task 3");

        listTasks.addFirst("Task 0");
        listTasks.addLast("Task 4");

        System.out.println("Tasks in the list: " + listTasks);

    }
}
