package gr.aueb.cf.ch3;
import java.util.Scanner;

/**
 * Ο χρήστης εισάγει αν βρέχει και την Θερμοκρασία
 * και το πρόγραμμα υπολογίζει αν χιονίζει
 * Χιονίζει σημαίνει οτι βρέχει και η θερμοκρασία < 0
 */
public class SnowingApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        int inputTemp = 0;
        boolean isRaining = false;
        boolean isSnowing = false;
        Scanner scanner = new Scanner(System.in);

        //Data binding
        System.out.println("Βρέχει; (true ή false)");
        isRaining = scanner.nextBoolean();

        System.out.println("Παρακαλώ είσαγετε την θερμοκρασία");
        inputTemp = scanner.nextInt();

        //Commands
        isSnowing = isRaining && (inputTemp < 0);

        //Result
        System.out.println("Χιονίζει: " + isSnowing);
    }
}
