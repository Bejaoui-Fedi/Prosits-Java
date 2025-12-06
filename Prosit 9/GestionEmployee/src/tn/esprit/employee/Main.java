package tn.esprit.employee;

public class Main {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();

        Employee e1 = new Employee(1, "Ali", "Karoui", "IT", 3);
        Employee e2 = new Employee(2, "Sami", "Mansour", "RH", 2);
        Employee e3 = new Employee(3, "Ali", "Ben Salah", "IT", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("Liste des employés :");
        societe.afficherEmploye();

        System.out.println("\nRecherche Ali : " + societe.rechercherEmploye("Ali"));

        System.out.println("\nTri par ID :");
        societe.trierEmployeParId();
        societe.afficherEmploye();

        System.out.println("\nTri par département + grade :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.afficherEmploye();
    }
}

