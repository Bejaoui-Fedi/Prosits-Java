package tn.esprit.gestionzoo.entities;

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

    public boolean isZooFull() {
        return currentIndex >= nbrCages;
    }

    public boolean addAnimal(Animal a) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein !");
            return false;
        }
        animals[currentIndex] = a;
        currentIndex++;
        return true;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticIndex >= aquaticAnimals.length) {
            System.out.println("Le zoo ne peut plus contenir d'animaux aquatiques !");
            return;
        }
        aquaticAnimals[aquaticIndex] = aquatic;
        aquaticIndex++;
    }

    public void makeAquaticsSwim() {
        for (int i = 0; i < aquaticIndex; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth() {
        float max = 0;
        for (int i = 0; i < aquaticIndex; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin p = (Penguin) aquaticAnimals[i];
                if (p.getSwimmingDepth() > max) {
                    max = p.getSwimmingDepth();
                }
            }
        }
        return max;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphins = 0, penguins = 0;
        for (int i = 0; i < aquaticIndex; i++) {
            if (aquaticAnimals[i] instanceof Dolphin)
                dolphins++;
            else if (aquaticAnimals[i] instanceof Penguin)
                penguins++;
        }
        System.out.println("Nombre de dauphins : " + dolphins);
        System.out.println("Nombre de pingouins : " + penguins);
    }
}
