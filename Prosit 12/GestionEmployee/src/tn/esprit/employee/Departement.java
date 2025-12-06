package tn.esprit.employee;

public class Departement {

    private int id;
    private String nom;
    private int nbEmployes;

    public Departement(){

    }

    public  Departement(int id, String nom, int nbEmployes) {
        this.id = id;
        this.nom = nom;
        this.nbEmployes = nbEmployes;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getNbEmployes() {
        return nbEmployes;
    }
    public void setNbEmployes(int nbEmployes) {
        this.nbEmployes = nbEmployes;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj)return true;
        if (!(obj instanceof Departement))return false;
        Departement d = (Departement)obj;
        return id == d.id && nom.equals(d.nom);
    }

    @Override
    public String toString(){
        return "Departement{" + "id=" + id + ", nom=" + nom + ", nbEmployes=" + nbEmployes + '}';
    }
}
