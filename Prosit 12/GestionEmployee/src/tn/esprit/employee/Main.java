package tn.esprit.employee;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        StudentManagement sm = new StudentManagement();

        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Sami", 22));
        list.add(new Student(1, "Amina", 20));
        list.add(new Student(2, "Karim", 23));

        System.out.println("=== Affichage normal ===");
        sm.displayStudents(list, s -> System.out.println(s));

        System.out.println("\n=== Affichage avec filtre (age > 21) ===");
        sm.displayStudentsByFilter(list, s -> s.getAge() > 21,
                s -> System.out.println(s));

        System.out.println("\n=== Retourner les noms ===");
        String names = sm.returnStudentsNames(list, s -> s.getNom());
        System.out.println(names);

        System.out.println("\n=== Création dynamique d'un étudiant ===");
        Student newSt = sm.createStudent(() -> new Student(5, "Nour", 19));
        System.out.println(newSt);

        System.out.println("\n=== Tri par ID ===");
        List<Student> sorted = sm.sortStudentsById(list, Comparator.comparingInt(Student::getId));
        sorted.forEach(System.out::println);

        System.out.println("\n=== Conversion en Stream ===");
        sm.convertToStream(list).forEach(System.out::println);
    }
}

