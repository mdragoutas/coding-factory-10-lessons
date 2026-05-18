package gr.aueb.cf.ch2;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * Διαβάζει 2 ακεραίους απο το stdin (keyboard)
 * και υπολογίζει το άθροισα και το εκτυπώνει στην κονσόλα
 */
public class AddScannerApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών

        Scanner scanner = new Scanner(System.in);
        int num1 , num2;
        int sum;

        //Διαβάζει και εκχωρεί τις μεταβλητές απο τον χρήστη (data binding)
        System.out.println("Πληκτρολογήστε 2 ακεραίους για να λάβετε το άθροισμα");
        num1 = scanner.nextInt();
        num2= scanner.nextInt();

        //Λογική
        sum= num1 + num2;

        //Εκτύπωση αποτελέσματος
        System.out.printf("Το άθροισμα των %d και %d είναι: %d", num1, num2, sum);

    }
}
