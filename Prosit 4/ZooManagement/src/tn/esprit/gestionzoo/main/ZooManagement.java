package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Esprit Zoo", "Tunis", 3);

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tigre = new Animal("Felidae", "Tigre", -2, true); // âge corrigé à 0

        zoo.addAnimal(lion);
        zoo.addAnimal(tigre);
        zoo.addAnimal(new Animal("Canidae", "Chacal", 4, true));
        zoo.addAnimal(new Animal("Felidae", "Panthère", 6, true)); // rejeté car zoo plein
    }
}
