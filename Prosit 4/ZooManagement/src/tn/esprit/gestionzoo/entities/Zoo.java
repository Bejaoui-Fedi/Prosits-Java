package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int currentIndex = 0; // nombre d’animaux ajoutés

    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        setName(name); // utilise setter pour contrôler le nom
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public boolean isZooFull() {
        return currentIndex >= nbrCages;
    }

    public boolean addAnimal(Animal a) {
        if (isZooFull()) {
            System.out.println("  Le zoo est plein !");
            return false;
        }
        animals[currentIndex] = a;
        currentIndex++;
        return true;
    }

    // Setter avec contrôle
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            this.name = "Zoo par défaut";
            System.out.println(" Le nom du zoo ne doit pas être vide → valeur par défaut appliquée.");
        }
    }

    public String getName() {
        return name;
    }
}
