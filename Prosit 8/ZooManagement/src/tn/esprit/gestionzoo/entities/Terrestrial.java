package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.interfaces.Omnivore;

public class Terrestrial extends Animal implements Omnivore<Food> {
    private int nbrLegs;

    public Terrestrial() {
        super();
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH)
            System.out.println(getName() + " mange de la viande.");
        else
            System.out.println(getName() + " refuse de manger de l’herbe.");
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH)
            System.out.println(getName() + " mange des plantes.");
        else
            System.out.println(getName() + " refuse la viande.");
    }

    @Override
    public void eatPlantAndMeet(Food food) {
        if (food == Food.BOTH)
            System.out.println(getName() + " mange de tout (omnivore).");
        else
            System.out.println(getName() + " préfère un régime varié.");
    }

    public String toString() {
        return super.toString() + " | NbrLegs=" + nbrLegs;
    }
}
