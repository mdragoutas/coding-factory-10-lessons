package gr.aueb.cf.java.ch4;

import java.util.Scanner;

/**
 * Ζητάει από τον χρήστη να δώσει έναν ακέραιο από το 1-7
 * και εκτυπώνει την αντίστοιχη ημέρα της βδομάδας
 * Δηλαδή στον αριθμό 1 επιστρέφει "Δευτέρα" κλπ
 */
public class WeekdayApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int choice = 0;

        //Λογική και επεξεργασία δεδομένων
        do {

            System.out.println("Δώστε έναν ακέραιο (1-7) (0 για έξοδο):");
            choice = in.nextInt();
            switch (choice) {

                //Εκτύπωση αποτελέσματος ανά περίπτωση
                case 1 -> System.out.println("Δευτέρα");
                case 2 -> System.out.println("Τρίτη");
                case 3 -> System.out.println("Τετάρτη");
                case 4 -> System.out.println("Πέμπτη");
                case 5 -> System.out.println("Παρασκευή");
                case 6 -> System.out.println("Σάββατο");
                case 7 -> System.out.println("Κυριακή");
                case 0 -> System.out.println("Έξοδος...");
                default -> System.out.println("Μη έγκυρος αριθμός. Επιλέξτε από 1 μέχρι 7");
            }
        } while(choice != 0);
    }
}