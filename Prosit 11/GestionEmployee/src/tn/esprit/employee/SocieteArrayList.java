package tn.esprit.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employee> {

    private ArrayList<Employee> employees = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employee e) {
        employees.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employee e : employees) {
            if (e.getNom().equalsIgnoreCase(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employee e) {
        return employees.contains(e);
    }

    @Override
    public void supprimerEmploye(Employee e) {
        employees.remove(e);
    }

    @Override
    public void afficherEmploye() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

     @Override
    public void trierEmployeParId() {
        Collections.sort(employees, Comparator.comparingInt(Employee::getId));
    }

     @Override
    public void trierEmployeParNomDépartementEtGrade() {
        employees.sort(
                Comparator.comparing(Employee::getNomDepartement)
                        .thenComparing(Employee::getGrade)
        );
    }
}

