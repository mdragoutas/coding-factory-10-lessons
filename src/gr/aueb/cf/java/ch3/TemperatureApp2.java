package gr.aueb.cf.java.ch3;
import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο που συμβολίζει
 * θερμοκρασία, και το πρόγραμμα υπολογίζει αν
 * η θερμοκρασία < 0 μία μεταβλητή, έτσω isTempBelowZero γίνεται true,
 * αλλιώς false
 * Τέλος εκτυπώνει το αποτέλεσμα
 */
public class TemperatureApp2 {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        boolean isTempBelowZero = false;
        int inputTemp = 0;
        Scanner scanner = new Scanner(System.in);

        //Data binding
        System.out.println("Είσαγετε την θερμοκρασία σε βαθμόυς Κελσίου");
        inputTemp = scanner.nextInt();

        //Commands
        isTempBelowZero = inputTemp < 0;
        System.out.println("Η θερμοκρασία είναι κάτω απο το μηδέν:\n" + isTempBelowZero);
    }
}
