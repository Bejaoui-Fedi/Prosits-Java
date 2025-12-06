package tn.esprit.employee;

public class Main {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();

        Employee e1 = new Employee(1, "Ali", "Karoui", "IT", 3);
        Employee e2 = new Employee(2, "Sami", "Mansour", "RH", 2);
        Employee e3 = new Employee(3, "Ali", "Ben Salah", "IT", 1);

        DepartementHashSet ds = new DepartementHashSet();

        Departement d1 = new Departement(2, "Informatique", 12);
        Departement d2 = new Departement(1, "RH", 5);
        Departement d3 = new Departement(3, "Finance", 20);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        ds.ajouterDepartement(d1);
        ds.ajouterDepartement(d2);
        ds.ajouterDepartement(d3);


        System.out.println("Liste des employés :");
        societe.afficherEmploye();

        System.out.println("\nRecherche Ali : " + societe.rechercherEmploye("Ali"));

        System.out.println("\nTri par ID :");
        societe.trierEmployeParId();
        societe.afficherEmploye();

        System.out.println("\nTri par département + grade :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.afficherEmploye();

        System.out.println("Liste des départements :");
        ds.displayDepartement();

        System.out.println("\nTri par ID :");
        for (Departement d : ds.trierDepartementById()) {
            System.out.println(d);
        }


        AffectationHashMap affect = new AffectationHashMap();

        affect.ajouterEmployeDepartement(e1, d1);
        affect.ajouterEmployeDepartement(e2, d2);

        System.out.println("=== Avant ajout double ===");
        affect.afficherEmployesEtDepartements();

         affect.ajouterEmployeDepartement(e1, d2);

        System.out.println("=== Après ajout double ===");
        affect.afficherEmployesEtDepartements();

    }
}

