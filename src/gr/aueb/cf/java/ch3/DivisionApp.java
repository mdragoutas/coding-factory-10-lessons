package gr.aueb.cf.java.ch3;

import java.util.Scanner;

/**
 * Επιτρέπει στον χρήστη να εισάγει αριθμητή και παρονομαστή
 * και να εκτελεί την διαίρεση
 */
public class DivisionApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 1;
        int result = 0;

        //Είσοδος και επεξεργασία δεδομένων
        while(true){
            System.out.println("Εισάγετε τον αριθμητή: (Έξοδος με 0)");
            numerator = in.nextInt();
            if (numerator == 0) {
                System.out.println("Έξοδος");
                break;
            }
            System.out.println("Παρακαλώ εισάγετε τον παρονομαστή");
            denominator = in.nextInt();
            if (denominator == 0){
                System.out.println("Ο παρονομαστής δεν μπορεί να είναι 0. Προσπαθήστε ξανά");
                continue;
            }

            //Εκτύπωση αποτελέσματος
            result = numerator / denominator;
            System.out.println("Το αποτέλεσμα της διαίρεσης " + numerator + "/" + denominator + " είναι " + result);
        }

    System.out.println("Ευχαριστούμε που χρησιμοποιήσατε το πρόγραμμα");

    }
}
