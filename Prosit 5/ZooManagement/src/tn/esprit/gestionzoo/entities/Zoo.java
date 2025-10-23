package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int currentIndex = 0;

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
}
