package gr.aueb.cf.java.ch3;

import java.util.Scanner;

/**
 * Ζητάει απο τον χρήστη να εισάγει ένα έτος
 * και το πρόγραμμα υπολογίζει αν είναι δίσεκτο ή όχι
 */
public class LeapYearApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών

        Scanner in = new Scanner(System.in);
        final int DIVISIBLE_BY_4 = 4;
        final int DIVISIBLE_BY_100 = 100;
        final int DIVISIBLE_BY_400 = 400;
        int inputYear = 0;
        int leapParameter1 = 0;
        int leapParameter2 = 0;
        int leapParameter3 = 0;

        //Είσοδος και επεξεργασία δεδομένων

        while(true){
            System.out.println("Παρακαλώ εισάγετε ένα έτος");
            inputYear = in.nextInt();
            leapParameter1 = inputYear % DIVISIBLE_BY_400;
            leapParameter2 = inputYear % DIVISIBLE_BY_4;
            leapParameter3 = inputYear % DIVISIBLE_BY_100;

        //Εκτύπωση αποτελέσματος

            if ((leapParameter1 == 0) || (leapParameter2 == 0 && leapParameter3 != 0)){
                System.out.println("Το έτος " + inputYear + " είναι δίσεκτο");
                break;
            }
            System.out.println("Το έτος " + inputYear + " δεν είναι δίσεκτο");
        }
        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε την εφαρμογή μας");
    }
}
