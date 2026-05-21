package gr.aueb.cf.java.ch3;

import java.util.Scanner;

/**
 * Διαβάζει από τον χρήστη ακεραίους,
 * μέχρι να δωθεί ο ακέραιος -1 (sentinel value)
 */
public class SentinelApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        //Data binding - Λογική
        System.out.println("Παρακαλώ είσαγετε έναν ακέραιο (-1  για έξοδο)");

        while ((num = scanner.nextInt()) != -1) {
            iterations++;
            System.out.println("Παρακαλώ εισάγετε έναν ακέραιο (-1 για έξοδο)");
        }

        //Εκτύπωση αποτελέσματος
        System.out.println("Iterations : " + iterations);
    }


}
