package weektwo.linkedlist;

import java.util.LinkedList;
/*
Reemplaza una tarea por otra (usando set() y indexOf()).
 */

public class ExerciseThree {
    public static void main(String[] args) {
        LinkedList<String> listTasks = new LinkedList<>();
        int index;

        listTasks.add("Task 1");
        listTasks.add("Task 2");
        listTasks.add("Task 3");

        System.out.println("Tasks in the list: " + listTasks);

        index = listTasks.indexOf("Task 2");
        if (index != -1) {
            listTasks.set(index, "Updated Task 2");
        }
        System.out.println("Updated list: " + listTasks);
    }
}
