package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Belvédère", "Tunis", 5);

        Dolphin d1 = new Dolphin("Delphinidae", "Flipper", 5, true, "Mer", 25.5f);
        Dolphin d2 = new Dolphin("Delphinidae", "Flipper", 5, true, "Mer", 22.0f);
        Penguin p1 = new Penguin("Spheniscidae", "Pingo", 3, false, "Antarctique", 40.0f);
        Penguin p2 = new Penguin("Spheniscidae", "Pango", 2, false, "Arctique", 35.0f);

        zoo.addAquaticAnimal(d1);
        zoo.addAquaticAnimal(d2);
        zoo.addAquaticAnimal(p1);
        zoo.addAquaticAnimal(p2);

        System.out.println("\n=== Tous les animaux aquatiques nagent ===");
        zoo.makeAquaticsSwim();

        System.out.println("\n=== Statistiques ===");
        zoo.displayNumberOfAquaticsByType();
        System.out.println("Profondeur max : " + zoo.maxPenguinSwimmingDepth());

        System.out.println("\n=== Test equals ===");
        System.out.println("d1 == d2 ? " + d1.equals(d2));
    }
}
