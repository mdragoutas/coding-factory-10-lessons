package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ζητάει από τον χρήστη να δώσει έναν ακέραιο αριθμό n
 * κι έπειτα εκτυπώνει n φορές το * οριζόντια
 */
public class Stars11App {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int count = 0;
        int inputNumber = 0;

        //Επεξεργασία Δεδομένων - Λογική
        System.out.println("Εισάγετε έναν ακέραιο αριθμό");
        inputNumber = in.nextInt();
        for(;;) {
            System.out.print("* ");
            count++;

            if(count == inputNumber) break;
        }
    }
}
