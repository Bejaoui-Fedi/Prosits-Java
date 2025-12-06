public class Animal {

    private String nom;
    private String espece;

    public Animal(String nom, String espece) {
        this.nom = nom;
        this.espece = espece;
    }

    public String getNom() {
        return nom;
    }

    public String getEspece() {
        return espece;
    }

    @Override
    public String toString() {
        return nom + " (" + espece + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Animal)) return false;
        Animal other = (Animal) obj;
        return this.nom.equalsIgnoreCase(other.nom) &&
                this.espece.equalsIgnoreCase(other.espece);
    }
}