package tn.esprit.employee;

public class Employee {

    private int id;
    private String nom ;
    private String prenon ;
    private String nomDepartement ;
    private int grade ;

    public Employee(){

    }
    public Employee(int id, String nom, String Prenon, String nomDepartement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenon = Prenon;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
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
    public String getPrenon() {
        return prenon;
    }
    public void setPrenon(String Prenon) {
        this.prenon = Prenon;
    }
    public String getNomDepartement() {
        return nomDepartement;
    }
    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
     public boolean equals (Object obj) {
        if(this==obj)return true;
        if(!(obj instanceof Employee)) return false;
        Employee e = (Employee) obj;
        return this.id == e.id && this.nom.equals(e.nom);
    }
    @Override
    public String toString() {
        return "Employee {"+
                "id"+id+
                ",Nom ='"+nom+'\''+
                ", Prénom ='"+prenon+
                ", nomDepartement ='"+nomDepartement+'\''+
                ", Grade ="+grade+
                '}';
    }

}
