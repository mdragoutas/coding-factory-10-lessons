package gr.aueb.cf.java.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο. Το πρόγραμμα υπολογίζει
 * την απόλυτη τιμή του (absolute). Η απόλυτη τιμή ενός ακεραίου είναι πάντα θετική
 * πχ. το απόλυτο του -5 είναι το 5, ενώ το απόλυτο του 5 είναι το 5
 */
public class AbsTernary {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        int absValue = 0;
        int inputNumber = 0;
        Scanner in = new Scanner(System.in);

        //Είσοδος και επεξεργασία δεδομένων
        System.out.println("Παρακαλώ είσαγετε έναν ακέραιο αριθμό");
        inputNumber = in.nextInt();

        absValue = inputNumber >= 0 ? inputNumber : -inputNumber;

        //Εκτύπωση αποτελέσματος
        System.out.printf("Η απόλυτη τιμή του %d είναι το %d\n", inputNumber, absValue);

    }
}
