package gr.aueb.cf.java.ch4;

/**
 * Υπολογίζει και εκτυπώνει το άθροισμα και το γινόμενο
 * των ακεραίων απο 1 έως 10
 */
public class SumMulApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        final int DESIRED_NUMBER = 10;
        int sum = 0;
        int mul = 1;

        //Επεξεργασία δεδομένων
        for (int i = 1; i <= DESIRED_NUMBER ; i++) {
            sum += i;
            mul *=i;
        }

        //Εκτύπωση αποτελέσματος
        System.out.printf("Sum: %d\nMul: %d\n", sum , mul );
    }
}
