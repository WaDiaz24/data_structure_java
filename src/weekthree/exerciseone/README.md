# ✅ Reto: Implementación de un Árbol Binario

## Instrucciones

1. **Crea una clase `TreeNode`.**
2. **Implementa una clase `BinaryTree` con un método `insert`.**
3. **Agrega varios valores y realiza un recorrido in-order** (izquierda, raíz, derecha).
4. **Imprime los valores del árbol en orden.**

---

### Ejemplo de uso

```java
BinaryTree tree = new BinaryTree();
tree.insert(8);
tree.insert(3);
tree.insert(10);
tree.insert(1);
tree.insert(6);
tree.insert(14);
tree.insert(4);

System.out.print("Recorrido in-order: ");
tree.printInOrder(); // Imprime: 1 3 4 6 8 10 14