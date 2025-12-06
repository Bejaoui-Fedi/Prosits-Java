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
