import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         String zooName;
        int nbrCages;

         System.out.print("Entrez le nom du zoo : ");
        zooName = sc.nextLine();

        while (zooName.trim().isEmpty()) {
            System.out.print("Le nom ne doit pas être vide. Réessayez : ");
            zooName = sc.nextLine();
        }

         System.out.print("Entrez le nombre de cages : ");
        nbrCages = sc.nextInt();

        while (nbrCages <= 0) {
            System.out.print("Le nombre doit être positif. Réessayez : ");
            nbrCages = sc.nextInt();
        }

         System.out.println(zooName + " comporte " + nbrCages + " cages");

        sc.close();

         Animal lion = new Animal("Félins", "Lion", 5, true);

         Zoo myZoo = new Zoo("belvedere", "Tunis", 25);

         lion.displayAnimal();
         myZoo.displayZoo();

        Animal tigre = new Animal("Félins", "Tigre", 3, true);
        Animal crocodile = new Animal("Reptiles", "Crocodile", 12, false);

        tigre.displayAnimal();
        crocodile.displayAnimal();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(lion);
        System.out.println(lion.toString());



    }
}
