package gr.aueb.cf.ch2;
import java.util.Scanner;
/**
 * Ο χρήστης εισάγει την ηλικία του σε έτη
 * και το πρόγραμμα επιστρέφει την ηλικία του σε ημέρες, όπου
 * θεωρούμε 1 έτος = 365 ημέρες. Για παράδειγμα αν δωθεί ηλικία
 * 20 ετών, το αποτέλεσμα θα είναι 7300 ημέρες
 */
public class YearsToDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageInYears;
        int ageInDays;
        final int DAYS_IN_YEAR = 365;
        System.out.println("Παρακαλώ πληκτρολογήστε την ηλικία σας σε έτη.");
        ageInYears = scanner.nextInt();
        ageInDays= ageInYears * DAYS_IN_YEAR;
        System.out.printf("Η ηλικίας σας σε έτη είναι: %d\nΗ ηλικία σας σε ημέρες είναι: %d",ageInYears, ageInDays);
    }
}
