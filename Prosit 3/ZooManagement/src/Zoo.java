public class Zoo {

    private String nom;
    private Animal[] animals;
    private int nbAnimaux;
    public static final int NBR_CAGES = 25; // constante

    public Zoo(String nom) {
        this.nom = nom;
        this.animals = new Animal[NBR_CAGES];
        this.nbAnimaux = 0;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Zoo plein ! Impossible d'ajouter " + animal);
            return false;
        }
        for (int i = 0; i < nbAnimaux; i++) {
            if (animals[i].equals(animal)) {
                System.out.println("Animal déjà présent !");
                return false;
            }
        }
        animals[nbAnimaux++] = animal;
        return true;
    }

    public void afficherZoo() {
        System.out.println("Animaux du zoo " + nom + " :");
        for (int i = 0; i < nbAnimaux; i++) {
            System.out.println("- " + animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbAnimaux; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) return false;
        animals[index] = animals[nbAnimaux - 1]; // remplace par le dernier
        animals[nbAnimaux - 1] = null;
        nbAnimaux--;
        return true;
    }

    public boolean isZooFull() {
        return nbAnimaux >= NBR_CAGES;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.nbAnimaux >= z2.nbAnimaux) ? z1 : z2;
    }
}