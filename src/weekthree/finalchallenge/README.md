# 🧩 Desafío Final – Gestión de una Biblioteca

## 🎯 Objetivo

Crear una mini app que gestione libros en una biblioteca. Podrás agregar libros, evitar duplicados, llevar registro por género y permitir búsquedas.

---

## 📚 Requisitos

### 1. Clase `Book`
Crea una clase `Book` con los siguientes atributos:
- `String title`
- `String author`
- `String genre`

Sobrescribe `equals()` y `hashCode()` para que dos libros con el mismo título y autor se consideren iguales.

---

### 2. Estructuras a usar

- `HashSet<Book>` para evitar libros duplicados.
- `HashMap<String, ArrayList<Book>>` para agrupar libros por género (clave = género, valor = lista de libros).

---

### 3. Funciones a implementar

- `addBook(Book book)`: agrega el libro al `HashSet` y al `HashMap` correspondiente.
- `printBooksByGenre(String genre)`: muestra todos los libros de un género.
- `searchBook(String title)`: busca por título e imprime si fue encontrado.

---

## 🧪 Ejemplo de uso esperado

```java
Book b1 = new Book("1984", "George Orwell", "Dystopian");
Book b2 = new Book("To Kill a Mockingbird", "Harper Lee", "Classic");
Book b3 = new Book("Animal Farm", "George Orwell", "Dystopian");

addBook(b1);
addBook(b2);
addBook(b3);
addBook(b1); // Duplicado, no se debe agregar

printBooksByGenre("Dystopian");
// → 1984, Animal Farm

searchBook("1984");
// → Found: 1984 by George Orwell# 🧩 Desafío Final – Gestión de una Biblioteca
