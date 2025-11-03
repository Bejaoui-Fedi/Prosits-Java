# 🦁 Zoo Management Project

A simple **Java Object-Oriented Programming (OOP)** project that manages animals in a zoo.
It demonstrates key OOP concepts such as **inheritance, polymorphism, exceptions, and encapsulation**.

---

## 📁 Project Structure

```
src/
 └── tn/
      └── esprit/
           └── gestionzoo/
                ├── entities/
                │    ├── Animal.java
                │    ├── Aquatic.java
                │    ├── Dolphin.java
                │    ├── Penguin.java
                │    ├── Terrestrial.java
                │    └── Zoo.java
                ├── exceptions/
                │    ├── ZooFullException.java
                │    └── InvalidAgeException.java
                └── main/
                     └── ZooManagement.java
```

---

## 🧩 Description of Packages and Classes

### 1. `entities` package

Contains all **core entity classes** of the zoo:

* **Animal.java** – Base class representing a generic animal (name, age, species, etc.).
* **Terrestrial.java** – Subclass for land animals (e.g., lions, elephants).
* **Aquatic.java** – Subclass for water animals (contains attributes like swimming depth).
* **Dolphin.java** – Represents a specific aquatic animal type with its own behavior.
* **Penguin.java** – Another aquatic subclass, specialized for penguins.
* **Zoo.java** – Main class for managing animals, including adding, listing, and counting them.

---

### 2. `exceptions` package

Contains **custom exceptions** used for error handling:

* **ZooFullException.java** – Thrown when trying to add an animal to a full zoo.
* **InvalidAgeException.java** – Thrown when an animal’s age is invalid (e.g., negative).

---

### 3. `main` package

Contains the **entry point** of the application:

* **ZooManagement.java** – Main class that runs the program.
  It creates a zoo, adds animals, and demonstrates exception handling and class interactions.

---

## ⚙️ Features

✅ Object-Oriented Design (OOP)
✅ Inheritance and Polymorphism
✅ Exception Handling
✅ Array-based Animal Storage
✅ Console-based Interaction

---

## 🚀 How to Run

1. Compile the project:

   ```bash
   javac -d bin src/tn/esprit/gestionzoo/**/*.java
   ```

2. Run the main program:

   ```bash
   java -cp bin tn.esprit.gestionzoo.main.ZooManagement
   ```

---

## 🧠 Example Usage

```java
Zoo zoo = new Zoo("Safari Park", "Tunis");
zoo.addAnimal(new Dolphin("Dolly", 5, "Ocean"));
zoo.addAnimal(new Penguin("Pingu", 3, "Arctic"));
zoo.displayAnimals();
```

---

## 👩‍💻 Author

Created by **[Bejaoui Fedi]**
Student project for **Object-Oriented Programming (Java)**.

---

## 📜 License

This project is for educational purposes only.
