package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Δημιουργεί ένα μενού και ζητάει από τον χρήστη
 * να επιλέξει μια λειτουργία. Έπειτα ζητάει έναν ακέραιο n.
 * Ανάλογα των επιλογών του χρήστη εκτυπώνει n αστεράκια σε
 * διάφορες μορφές μέχρι να επιλέξει 'Έξοδος'
 */
public class StarsMenuApp {
    static Scanner in = new Scanner(System.in);
    static final int EXIT = 6;

    public static void main(String[] args) {
        int choice = 0;
        int desiredNumber = 0;
        int inputNumber = 0;

        while (true) {
            printMenu();
            choice = in.nextInt();

            if (choice == EXIT) {
                System.out.println("Έξοδος...");
                break;
            }
            if (!isChoiceValid(choice)) {
                System.out.println("Μη έγκυρη επιλογή. Προσπαθήστε ξανά.");
                continue;
            }

            System.out.println("Εισάγετε έναν ακέραιο αριθμό");
            desiredNumber = getOneInt(inputNumber);

            switch (choice) {
                case 1 -> starsHorizontal(desiredNumber);
                case 2 -> starsVertical(desiredNumber);
                case 3 -> starsGrid(desiredNumber);
                case 4 -> starsAscending(desiredNumber);
                case 5 -> starsDescending(desiredNumber);
                default -> System.out.println("Μη έγκυρη επιλογή");
            };
        }
    }

    /**
     * Δέχεται από τον χρήστη έναν ακέραιο αριθμό
     * @param choice    Ο αριθμός της επιλογής του
     * @return  Τον αριθμό
     */
    public static int getOneInt(int choice) {
        return in.nextInt();
    }

    public static void printMenu(){
        System.out.println("Παρακαλώ επιλέξτε ένα από τα παρακάτω");
        System.out.println("1. Οριζόντια αστεράκια");
        System.out.println("2. Κάθετα αστεράκια");
        System.out.println("3. Πλέγμα από αστεράκια");
        System.out.println("4. Αστεράκια κατά αύξοντα αριθμό");
        System.out.println("5. Αστεράκια κατά φθίνοντα αριθμό");
        System.out.println("6. Έξοδος");
    }

    public static boolean isChoiceValid (int choice) {
        return choice >=1 && choice <= EXIT;
    }

    public static void starsHorizontal(int n) {

        for (int i = 1; i <= n ; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void starsVertical(int n) {

        for (int i = 1; i <= n ; i++) {
            System.out.println("*");
        }
        System.out.println();
    }

    public static void starsGrid(int n) {

        for (int i = 1; i <= n; i++) {
            starsHorizontal(n);
            System.out.println();
        }
    }

    public static void starsAscending(int n) {

        for (int i = 1; i <= n ; i++) {
            starsHorizontal(i);
        }
        System.out.println();
    }

    public static void starsDescending(int n) {

        for (int i = n; i >= 1 ; i--) {
            starsHorizontal(i);
        }
        System.out.println();
    }
}
