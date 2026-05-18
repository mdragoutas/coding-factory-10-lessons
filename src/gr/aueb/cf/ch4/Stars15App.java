package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ζητάει από τον χρήστη έναν ακέραιο n και το πρόγραμμα
 * εκτυπώνει * από το n μέχρι το 1 ανάλογα τον αριθμό της σειράς
 * Στην 1η σειρά δηλαδή θα εκτυπώνει n φορές * , στην 2η n-1 φορές *
 * ... και στην n-οστή σειρά 1 *
 */
public class Stars15App {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int inputNumber = 0;

        //Επεξεργασία Δεδομένων
        System.out.println("Εισάγετε έναν ακέραιο αριθμό");
        inputNumber = in.nextInt();

        for (int i = 1; i <= inputNumber ; i++) {
            for (int j = inputNumber; j >= i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

