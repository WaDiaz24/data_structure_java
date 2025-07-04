package weekthree.exerciseone;

public class TreeMain {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Insert values into the binary tree
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        // Print the values in order
        System.out.println("In-order traversal of the binary tree:");
        tree.printInOrder();  // Expected output: 2 3 4 5 6 7 8
    }
}
