package gr.aueb.cf.java.ch3;

import java.util.Scanner;

/**
 * Τριαδικός τελεστής για τον υπολογισμό του
 * μικρότερου μεταξύ ακεραίων
 */
public class TernaryApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών

        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        //Είσοδος και επεξεργασία δεδομένων - Εκχώρηση υπό συνθήκη (Conditional Assignment)

        System.out.println("Παρακαλώ εισάγετε 2 ακεραίους");
        num1 = in.nextInt();
        num2 = in.nextInt();

        min = num1 < num2 ? num1 : num2;

        //Εκτύπωση αποτελέσματος

        System.out.println("MINIMUM: " + min);
    }
}
