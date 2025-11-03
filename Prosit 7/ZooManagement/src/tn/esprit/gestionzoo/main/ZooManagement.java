package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.*;

public class ZooManagement {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Belvédère", "Tunis", 3);

        Animal lion = new Animal("Félin", "Lion", 5, true);
        Animal tigre = new Animal("Félin", "Tigre", -3, true); // âge négatif
        Animal chacal = new Animal("Canidé", "Chacal", 4, true);
        Animal girafe = new Animal("Giraffidae", "Girafe", 2, true);

        try {
            zoo.addAnimal(lion);
            zoo.addAnimal(tigre);
            zoo.addAnimal(chacal);
            zoo.addAnimal(girafe); // provoque ZooFullException
        } catch (ZooFullException e) {
            System.out.println("❌ ERREUR : " + e.getMessage());
        }

        System.out.println("\nProgramme terminé sans crash ✅");
    }
}
