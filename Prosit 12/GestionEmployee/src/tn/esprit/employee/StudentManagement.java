package tn.esprit.employee;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

public class StudentManagement implements Management {

    // Afficher tous les étudiants avec un Consumer
    @Override
    public void displayStudents(List<Student> students, Consumer<Student> con) {
        students.forEach(con);
    }

    // Afficher les étudiants selon un filtre (Predicate)
    @Override
    public void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con) {
        students.stream()
                .filter(pre)
                .forEach(con);
    }

    // Retourner une chaîne avec les noms via Function<Student, String>
    @Override
    public String returnStudentsNames(List<Student> students, Function<Student, String> fun) {
        StringBuilder sb = new StringBuilder();
        for (Student s : students) {
            sb.append(fun.apply(s)).append(" ");
        }
        return sb.toString().trim();
    }

    // Créer un étudiant avec Supplier<Student>
    @Override
    public Student createStudent(Supplier<Student> sup) {
        return sup.get();
    }

    // Trier la liste selon un Comparator
    @Override
    public List<Student> sortStudentsById(List<Student> students, Comparator<Student> com) {
        List<Student> sorted = new ArrayList<>(students);
        sorted.sort(com);
        return sorted;
    }

    // Convertir une liste en Stream
    @Override
    public Stream<Student> convertToStream(List<Student> students) {
        return students.stream();
    }
}

