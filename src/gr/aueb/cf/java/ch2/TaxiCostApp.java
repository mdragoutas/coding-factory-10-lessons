package gr.aueb.cf.java.ch2;
import java.util.Scanner;

/**
 * Διαβάζει από την κονσόλα την απόσταση σε ακέραια χιλιόμετρα
 * και υπολογίζει και εκτυπώνει το συνολικό κόστος μιάς
 * διαδρομής που έκανε ένα ταξί πχ για 10 km το κόστος είναι 10,40 ευρώ
 */
public class TaxiCostApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int distance ;
        final int STARTING_COST_EUROS = 3;
        int costEuros ;
        int costCents;
        final int COST_PER_KM_CENTS = 74;

        //Εκχώρηση μεταβλητής απο τον χρήστη (data binding)
        System.out.println("Παρακαλώ εισάγετε την απόσταση που διανύσατε σε ακέραια χιλιόμετρα");
        distance = scanner.nextInt();

        //Λογική
        costEuros = STARTING_COST_EUROS + (distance * COST_PER_KM_CENTS / 100);
        costCents = distance * COST_PER_KM_CENTS % 100;

        //Εκτύπωση αποτελέσματος
        System.out.printf("Κόστος: %d ευρώ και %d λεπτά", costEuros, costCents );
    }
}
