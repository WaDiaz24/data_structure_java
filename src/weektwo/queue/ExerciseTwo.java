package weektwo.queue;

import java.util.LinkedList;
import java.util.Queue;
/*
Crea una cola de documentos. Cada documento tiene un nombre (String).
Atiende los documentos uno por uno (imprímelos y elimínalos de la cola).
 */

public class ExerciseTwo {
    public static void main(String[] args) {
        Queue<String> documents = new LinkedList<>();

        documents.add("Document1.pdf");
        documents.add("Document2.pdf");
        documents.add("Document3.pdf");

        System.out.println("Initial queue of documents: " + documents);
        while (!documents.isEmpty()) {
            System.out.println("Document printing: " + documents.peek());
            System.out.println("Document complete: " + documents.poll());
        }
        System.out.println("Remaining documents in queue: " + documents);
    }
}
