public class ZooManagement {

    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Belvidére");
        Zoo zoo2 = new Zoo("Vaga");

        Animal a1 = new Animal("Lion", "Félin");
        Animal a2 = new Animal("Tigre", "Félin");
        Animal a3 = new Animal("Lion", "Félin"); // identique à a1

        zoo1.addAnimal(a1);
        zoo1.addAnimal(a2);
        zoo1.addAnimal(a3);

        zoo1.afficherZoo();

        System.out.println("Indice du Lion : " + zoo1.searchAnimal(a1));
        System.out.println("Indice d'un animal inexistant : " + zoo1.searchAnimal(new Animal("Ours", "Ursidae")));

        zoo1.removeAnimal(a2);
        zoo1.afficherZoo();

        zoo2.addAnimal(new Animal("Éléphant", "Mammifère"));
        Zoo plusGrand = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d'animaux est : " + plusGrand);
    }
}