package gr.aueb.cf.java.ch8;

import java.util.Scanner;

/**
 * Η {@link BankApp} παρέχει μία μόνο υπηρεσία,
 * την υπηρεσία κατάθεσης.
 */
public class BankApp {
    static double balance = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = 0.0;

        try {
            System.out.println("Παρακαλώ εισάγετε το ποσό που θέλετε να καταθέσετε:");
            amount = scanner.nextInt();

            deposit(amount);
        } catch (Exception e) {
            System.out.println("Η κατάθεση απέτυχε.");
        }
    }

    /**
     *
     * @param amount        The amount to deposit
     * @throws Exception    Throws exception when the selected amount is negative
     */
    public static void deposit(double amount) throws Exception {
        try {
            if (amount < 0) throw new Exception("Το ποσό δεν μπορεί να είναι αρνητικό");
            balance += amount;
        } catch (Exception e) {
            System.err.println(e.getMessage());     // logging
            throw e;                                // rethrow
        }
    }
}
