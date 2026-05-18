package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ζητάει από τον χρήστη να εισάγει έναν ακέραιο n και μετά εκτυπώνει
 * από το 1 μέχρι το n τόσα * ανάλογα τον αριθμό της σειράς
 * Δηλαδή στην 1η γραμμή θα έχει * , στην 2η **,... και στην n-οστή n φορές το *
 */
public class Stars14App {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int inputNumber = 0;

        //Επεξεργασία δεδομένων - Λογική
        System.out.println("Εισάγετε έναν ακέραιο αριθμό");
        inputNumber = in.nextInt();

        for (int i = 1; i <= inputNumber ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
