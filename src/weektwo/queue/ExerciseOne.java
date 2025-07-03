package weektwo.queue;

import java.util.LinkedList;
import java.util.Queue;
/*
FIFO
Crea una cola de clientes (nombres). Agrega 5, atiende 2 (usando .poll()), imprime el resto.
 */

public class ExerciseOne {
    public static void main(String[] args) {
        Queue<String> clients = new LinkedList<>();

        clients.add("Alice");
        clients.add("Bob");
        clients.add("Charlie");
        clients.add("Diana");
        clients.add("Ethan");

        System.out.println("Initial queue of clients: "+ clients);

        clients.poll();
        clients.poll();

        System.out.println("Remaining clients: " + clients);
    }
}
