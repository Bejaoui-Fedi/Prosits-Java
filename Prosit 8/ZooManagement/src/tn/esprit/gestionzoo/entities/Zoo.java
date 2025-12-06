package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class Zoo {
    private Animal[] animals;
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private String name;
    private String city;
    private int nbrCages;
    private int currentIndex = 0;
    private int aquaticIndex = 0;

    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    // ✅ Nouvelle version sans boolean
    public void addAnimal(Animal a) throws ZooFullException {
        if (currentIndex >= nbrCages) {
            // Lève une exception si le zoo est plein
            throw new ZooFullException("Le zoo est plein ! Impossible d’ajouter " + a.toString());
        }
        animals[currentIndex] = a;
        currentIndex++;
        System.out.println("Animal ajouté : " + a);
        System.out.println("Nombre total d’animaux : " + currentIndex);
    }

    // 🔹 autres méthodes inchangées (addAquaticAnimal, etc.)
}
