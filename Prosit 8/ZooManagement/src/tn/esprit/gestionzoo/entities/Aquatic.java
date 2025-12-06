package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.interfaces.Carnivore;

public abstract class Aquatic extends Animal implements Carnivore<Food> {
    private String habitat;

    public Aquatic() {
        super();
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public abstract void swim();

     @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH)
            System.out.println(getName() + " mange de la viande.");
        else
            System.out.println(getName() + " ne mange pas de plantes !");
    }

    public String toString() {
        return super.toString() + " | Habitat=" + habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aquatic other = (Aquatic) obj;
        return getAge() == other.getAge() &&
                getHabitat().equals(other.getHabitat()) &&
                getName().equals(other.getName());
    }
}
