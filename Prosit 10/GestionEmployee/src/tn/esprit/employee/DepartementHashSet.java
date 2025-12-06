package tn.esprit.employee;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Comparator;

public class DepartementHashSet implements IDepartement<Departement> {

    private HashSet<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement d) {
        departements.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement d : departements) {
            if (d.getNom().equalsIgnoreCase(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        departements.remove(d);
    }

    @Override
    public void displayDepartement() {
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    // Tri par id → retourner TreeSet trié
    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sorted =
                new TreeSet<>(Comparator.comparingInt(Departement::getId));

        sorted.addAll(departements);

        return sorted;
    }
}

