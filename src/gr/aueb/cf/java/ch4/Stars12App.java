package gr.aueb.cf.java.ch4;

import java.util.Scanner;

/**
 * Ζητάει από τον χρήστη να δώσει έναν ακέραιο αριθμό n
 * κι έπειτα εκτυπώνει n φορές το * κάθετα
 */
public class Stars12App {
    public static void main(String[] args) {

        //Δήλωση και αρχικποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int count = 0;
        int inputNumber = 0;

        //Επεξεργασία Δεδομένων - Λογική
        System.out.println("Εισάγετε έναν ακέραιο αριθμό");
        inputNumber = in.nextInt();
        for(;;) {
            System.out.println("*");
            count++;

            if(count == inputNumber) break;
        }
    }
}