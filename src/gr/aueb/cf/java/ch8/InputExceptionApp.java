package gr.aueb.cf.java.ch8;

import java.util.Scanner;

/**
 * Το {@link java.util.InputMismatchException} δημιουργείται όταν προσπαθούμε
 * να διαβάσουμε τύπο δεδομένων διαφορετικό από αυτό που περιμένουμε
 */
public class InputExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Εισάγετε έναν ακέραιο");
        //num = in.nextInt();
        if (!in.hasNextInt()) {
            System.out.println("Δεν εισάγατε ακέραιο");
        } else {
            num = in.nextInt();
            System.out.println("Ο ακέραιος είναι ο: " + num);
        }
    }
}
