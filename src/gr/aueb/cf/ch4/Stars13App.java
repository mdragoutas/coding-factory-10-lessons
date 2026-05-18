package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ζητάει από τον χρήστη έναν ακέραιο αριθμό n
 * και το πρόγραμμα εκτυπώνει σε μορφή n x n το *
 */
public class Stars13App {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);

        int inputNumber = 0;

        //Επεξεργασία Δεδομένων - Λογική
        System.out.println("Εισάγετε έναν ακέραιο αριθμό");
        inputNumber = in.nextInt();


        for(int i = 1; i <= inputNumber; i++) {
            for(int j = 1; j <= inputNumber; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
