package weekone.finalchallengue;

import java.util.ArrayList;

public class ContactMain {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Alice", "123-456-7890"));
        contacts.add(new Contact("Bob", "987-654-3210"));
        contacts.add(new Contact("Charlie", "555-555-5555"));

        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.name() + ", Phone Number: " + contact.phoneNumber());
        }
        searchContactByName(contacts, "Alice");
        deleteContactByName(contacts, "Bob");

        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.name() + ", Phone Number: " + contact.phoneNumber());
        }
    }

    public static void searchContactByName(ArrayList<Contact> contacts, String name) {
        for (Contact contact : contacts) {
            if (contact.name().equalsIgnoreCase(name)) {
                System.out.println("Found: " + contact.name() + ", Phone Number: " + contact.phoneNumber());
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public static void deleteContactByName(ArrayList<Contact> contacts, String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).name().equalsIgnoreCase(name)) {
                contacts.remove(i);
                System.out.println("Deleted contact: " + name);
                return;
            }
        }
        System.out.println("Contact not found.");
    }
}
