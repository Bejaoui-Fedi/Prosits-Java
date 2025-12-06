package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

     public Animal() {}

     public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            try {
                throw new tn.esprit.gestionzoo.exceptions.InvalidAgeException(
                        "Âge négatif détecté pour " + name + " (" + age + ") !");
            } catch (tn.esprit.gestionzoo.exceptions.InvalidAgeException e) {
                System.out.println("❌ ERREUR : " + e.getMessage());
                this.age = 0;
            }
        } else {
            this.age = age;
        }
    }


    public String getName() {
        return name;
    }

    public String toString() {
        return "Animal [Famille=" + family + ", Nom=" + name + ", Âge=" + age + ", Mammifère=" + isMammal + "]";
    }
}
