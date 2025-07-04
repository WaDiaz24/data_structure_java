package weekthree.exerciseone;

public class BinaryTree {
    private TreeNode root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private TreeNode insertRecursive(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        }
        if (value < node.getValue()) {
            node.setLeft(insertRecursive(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(insertRecursive(node.getRight(), value));
        }
        return node;
    }

    public void printInOrder() {
        printInOrderRecursive(root);
    }

    private void printInOrderRecursive(TreeNode node) {
        if(node != null) {
            printInOrderRecursive(node.getLeft());
            System.out.print(node.getValue() + " ");
            printInOrderRecursive(node.getRight());
        }
    }
}
