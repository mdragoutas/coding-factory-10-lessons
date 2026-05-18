package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει απλο τον χρήστη έναν ακέραιο που
 * αντιστοιχεί σε ώρες (hours). Μετατρέπει
 * σε λεπτά και δευτερόλεπτα και το εκτυπώνει πχ
 */
public class HoursToMinSec {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int hours = 0;
        int mins = 0;
        int secs = 0;
        final int MINS_IN_HOURS = 60;
        final int SECS_IN_MINS = 60;

        //Data binding
        System.out.println("Παρακαλώ είσαγετε ενάν ακέραιο αριθμό που θα αντιστοιχεί σε ώρες");
        hours = scanner.nextInt();

        //Λογική
        mins = hours * MINS_IN_HOURS;
        secs = mins * SECS_IN_MINS;

        //Εκτύπωση αποτελέσματος
        System.out.printf("Οι %d ώρες αντιστοιχούν σε:\n%d λεπτά ή σε %d δευτερόλεπτα", hours, mins, secs);
    }
}
