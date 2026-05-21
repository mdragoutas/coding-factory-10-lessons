package gr.aueb.cf.java.ch2;
import java.util.Scanner;

/**
 * Σε έναν χώρο στάθμευσης: η 1η ώρα κοστίζει 2 (200 λεπτά) ευρώ
 * και κάθε επιπλέον ώρα κοστίζει 1 (100 λεπτά) ευρώ και 50 λεπτά
 * Ο χρήστης εισάγει τον αριθμό των ωρών που στάθμευσε και
 * το πρόγραμμα επιστρέφει το συνολικό κόστος
 * ΠΧ αν ο χρήστης στάθμευσε για 5 ώρες, το κόστος θα είναι 8 ευρώ
 */
public class ParkingApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int hoursParked = 0;
        final int STARTING_COST = 200;
        final int EACH_ADDITIONAL_HOUR_COST = 150;
        int totalCostInCents = 0;
        int costEuros = 0;
        int costCents = 0;
        //DATA BINDING
        System.out.println("Παρακαλώ εισάγετε τις ώρες που σταθμεύσατε");

        //Λογική
        hoursParked = scanner.nextInt();
        totalCostInCents = STARTING_COST + (hoursParked - 1) * EACH_ADDITIONAL_HOUR_COST;
        costEuros = totalCostInCents / 100;
        costCents = totalCostInCents % 100;

        //Εκτύπωση αποτελέσματος
        System.out.printf("Το κόστος για %d ώρες είναι:\n%d ευρώ και %d λεπτά", hoursParked, costEuros, costCents);
    }
}