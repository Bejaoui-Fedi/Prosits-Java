package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.*;

public class ZooManagement {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Belvédère", "Tunis", 10);

        Aquatic dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Mer", 20.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Pingo", 3, false, "Antarctique", 40.0f);

        Terrestrial lion = new Terrestrial("Félin", "Lion", 6, true, 4);       // Carnivore
        Terrestrial elephant = new Terrestrial("Éléphantidé", "Éléphant", 12, true, 4); // Herbivore
        Terrestrial bear = new Terrestrial("Ursidae", "Ours", 8, true, 4);     // Omnivore

        System.out.println(" Test alimentation ");

        // Carnivore
        lion.eatMeat(Food.MEAT);
        lion.eatPlant(Food.PLANT);

        // Herbivore
        elephant.eatPlant(Food.PLANT);
        elephant.eatMeat(Food.MEAT);

        // Omnivore
        bear.eatMeat(Food.MEAT);
        bear.eatPlant(Food.PLANT);
        bear.eatPlantAndMeet(Food.BOTH);

        // Aquatiques (Carnivores)
        dolphin.eatMeat(Food.MEAT);
        penguin.eatMeat(Food.PLANT);


    }
}
