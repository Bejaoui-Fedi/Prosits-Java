package tn.esprit.employee;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;

public class AffectationHashMap {

     private HashMap<Employee, Departement> map = new HashMap<>();

     public void ajouterEmployeDepartement(Employee e, Departement d) {
        map.put(e, d);   // Remplace automatiquement si e existait déjà
    }

     public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employee, Departement> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        }
    }

     public void supprimerEmploye(Employee e) {
        map.remove(e);
    }

     public void supprimerEmployeEtDepartement(Employee e, Departement d) {
        if (map.containsKey(e) && map.get(e).equals(d)) {
            map.remove(e);
        }
    }

     public void afficherEmployes() {
        for (Employee e : map.keySet()) {
            System.out.println(e);
        }
    }

     public void afficherDepartements() {
        for (Departement d : map.values()) {
            System.out.println(d);
        }
    }

     public boolean rechercherEmploye(Employee e) {
        return map.containsKey(e);
    }

     public boolean rechercherDepartement(Departement d) {
        return map.containsValue(d);
    }

     public TreeMap<Employee, Departement> trierMap() {
        return new TreeMap<>(
                Comparator.comparingInt(Employee::getId)
        ) {{
            putAll(map);
        }};
    }
}

