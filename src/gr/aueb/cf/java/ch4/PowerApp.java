package gr.aueb.cf.java.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει την βάση a και τον εκθέτη b και το πρόγραμμα
 * υπολογίζει την δύναμη α^β και το εκτυπώνει
 */
public class PowerApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int base = 0;
        int exponent = 0;
        int result = 1;

        System.out.println("Παρακαλώ εισάγετε την βάση (base) και τον εκθέτη (exponent)");
        base = in.nextInt();
        exponent = in.nextInt();

        for (int i = 1; i <= exponent ; i++) {
            result *= base;
        }

        System.out.printf("%d^%d=%d", base, exponent, result);
    }
}
