package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει τους ακεραίους 1-10
 * με αντίστροφη σειρά
 */
public class CountdownApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        final int START = 1;
        final int END = 10;

        //Επεξεργασία δεδομενών και Εκτύπωση αποτελέσματος
        for (int i = END; i >= START ; i--) {
            System.out.print(i + " ");
        }
    }
}
