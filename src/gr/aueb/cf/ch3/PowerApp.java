package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει δύο ακεραίους a και b (όπου a = η βάση
 * και b = ο εκθέτης) και το πρόγραμμα υπολογίζει την πράξη
 * a ^ b (a εις την b) και εκτυπώνει το αποτέλεσμα
 */
public class PowerApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int result = 1;
        int i = 1;

        //Data binding
        System.out.println("Παρακαλώ εισάγετε 2  θετικούς ακεραίους");
        a = in.nextInt();
        b = in.nextInt();

        //Λογική
        while (i <= b) {
            result *= a;
            i++;
        }

        //Εκτύπωση αποτελέσματος
        System.out.printf("Το αποτέλεσμα της πράξης %d^%d είναι : %,d", a, b, result);
    }
}
