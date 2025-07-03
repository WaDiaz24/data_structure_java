package weektwo.linkedlist;
/*
Agrega tareas y elimina una tarea específica por nombre. Usa .remove("Tarea").
 */
import java.util.LinkedList;

public class ExerciseTwo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Task 1");
        list.add("Task 2");
        list.add("Task 3");

        System.out.println("Initial list: " + list);
        list.remove("Task 2");
        System.out.println("Updated list: " + list);
    }
}
