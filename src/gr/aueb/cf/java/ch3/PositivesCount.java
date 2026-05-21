package gr.aueb.cf.java.ch3;

import java.util.Scanner;

/**
 * Μετράει το πλήθος των θετικών ακεραίων
 * που δίνει ο χρήστης και σταματάει όταν ο χρήστης
 * δώσει αρνητικό αριθμό
 */
public class PositivesCount {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int positivesCount = 0;
        int num = 0;

        //Όσο υπάρχουν δεδομένα - do
        System.out.println("Εισάγετε έναν ακέραιο αριθμό (αρνητικός για έξοδο)");
        num = scanner.nextInt();

        //Λογική
        while (num >= 0) {
            positivesCount++;
            System.out.println("Εισάγετε έναν ακέραιο αριθμό (αρνητικός για έξοδο)");
            num = scanner.nextInt();
        }

        //Εκτύπωση αποτελέσματος
        System.out.println("Το πλήθος των θετικών είναι : " + positivesCount);
    }
}
