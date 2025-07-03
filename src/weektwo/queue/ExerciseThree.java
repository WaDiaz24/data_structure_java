package weektwo.queue;

import java.util.LinkedList;
import java.util.Queue;
/*
No usamos PriorityQueue aún:
Simula atención de personas mayores de edad primero.
Usa dos colas: una para mayores y otra para menores. Atiende primero los mayores.
 */

public class ExerciseThree {
    public static void main(String[] args) {
        Queue<String> olderPeople = new LinkedList<>();
        Queue<String> youngerPeople = new LinkedList<>();

        olderPeople.add("Alice");
        olderPeople.add("Bob");
        olderPeople.add("Charlie");

        youngerPeople.add("Diana");
        youngerPeople.add("Ethan");

        System.out.println("Older people queue: " + olderPeople);
        servePeople(olderPeople, "Older person");
        System.out.println("Younger people queue: " + youngerPeople);
        servePeople(youngerPeople, "Younger person");
        System.out.println("All people have been served.");
    }

    public static void servePeople(Queue<String> queue, String label) {
        while (!queue.isEmpty()) {
            System.out.println(label + " being served: " + queue.poll());
        }
    }
}
