package gr.aueb.cf.java.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει με την χρήση μεθόδου το παργοντικό
 * του n. Όπου n!= 1 * 2 * 3 * ... * n
 */
public class Factorial {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση
        Scanner in = new Scanner(System.in);

        int n = 0;
        int product = 0;

        //Input and Data Binding
        System.out.println("Δώστε έναν θετικό ακέραιο");
        n = in.nextInt();

        //Calls the service of  the method facto/ Delegation
        product = facto(n);

        //Prints result
        System.out.printf("Το αποτέλεσμα του %d! είναι: %d" ,n , product);
    }

    /**
     * Calculates factorial of n
     *
     * @param n     the number to calculate factorial for
     * @return      the factorial of n
     */
    public static int facto(int n){

        int product = 1;

        for (int i = 1; i <= n ; i++) {
            product *= i;
        }

        return product;
    }
}
