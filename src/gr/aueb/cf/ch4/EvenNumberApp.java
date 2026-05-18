package gr.aueb.cf.ch4;

/**
 * Υπολογίζει και εκτυπώνει όλους τους άρτιους
 * ακεραίους από το 1 μέχρι το 20
 */
public class EvenNumberApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        final int START = 1;
        final int END = 20;
        int remainder = 0;
        final int DIVISOR = 2;

        //Επεξεργασία δεδομένων - Λογική
        System.out.println("Οι ζυγοί ακέραιοι αριθμοί από το 1 - 20 είναι οι: ");

        for (int i = START; i <= END ; i++) {
            remainder = i % DIVISOR;
            if (remainder == 0) {
                System.out.println(i);
            }
        }
    }
}
