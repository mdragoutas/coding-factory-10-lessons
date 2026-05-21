package gr.aueb.cf.java.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει n ακεράιους και
 * το πρόγραμμα υπολογίζει και εκτυπώνει
 * το άθροισμα και το γινόμενό τους
 */
public class SumMulFlex {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int i = 1;
        int sum = 0;
        int product = 1;
        int n = 0;

        //Data Binding - Λογική

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο n");
        n = scanner.nextInt();
        System.out.printf("Παρακαλώ εισάγετε %d ακεραίους\n", n);

        while (i <= n) {
            num = scanner.nextInt();
            sum += num;
            product *= num;
            i++;
        }

        //Εκτύπωση αποτελέσματος

        System.out.println("Το άθροισμα είναι : " + sum);
        System.out.println("Το γινόμενο είναι : " + product);
    }
}
