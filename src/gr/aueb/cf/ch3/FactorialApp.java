package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο n και το πρόγραμμα
 * υπολογίζει το n! (n παραγοντικό) και το εκτυπώνει
 */
public class FactorialApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int n = 0;
        int facto = 1;
        int i = 1;

        //Data binding
        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο n");
        n = in.nextInt();

        //Λογική
        while (i <= n) {
            facto *= i;
            i++;
        }

        //Εκτύπωση αποτελέσματος
        System.out.printf("%d! = %,d\n", n, facto);

    }
}
