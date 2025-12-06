package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Aquatic a = new Aquatic("Fish", "Poisson", 2, false, "Mer");
        Dolphin d = new Dolphin("Delphinidae", "Flipper", 5, true, "Mer", 25.5f);
        Penguin p = new Penguin("Spheniscidae", "Pingo", 3, false, "Antarctique", 40.0f);
        Terrestrial t = new Terrestrial("Felidae", "Tigre", 8, true, 4);

        System.out.println(d);
        System.out.println(p);
        System.out.println(t);

        a.swim();
        d.swim();
        p.swim(); // hérit
    }

}
