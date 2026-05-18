package gr.aueb.cf.ch2;
import java.util.Scanner;

/**
 * Requests the user to insert 3 ints
 * 1 for the day, the month and the year
 * and then prints it in a standard Date Format DD/MM/YYYY
 */
public class DateApp {
    public static void main(String[] args) {
        //Δήλωση μεταβλητών
        Scanner in = new Scanner(System.in);
        int day, month, year;
        System.out.printf("Παρακλώ πληκτρολογήστε με την σειρά:\n1. Την σημερινή ημέρα του μήνα (1-31)\n2. Τον αριθμό του μήνα (1-12)\n3. Το έτος\n");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();
        //Εκτυπώνει την ημερομηνία
        System.out.printf("Η σημερινή ημερομηνία είναι %d/%d/%d", day , month , year);
    }
}