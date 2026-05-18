package gr.aueb.cf.ch2;

import java.util.Scanner;
/**
 * Μετατρέπει την Θερμοκρασία που δίνει ο χρήστης
 * από Fahrenheit σε Celsius και
 * το εκτυπώνει στην κονσόλα
 */
public class TemperatureApp {
    public static void main(String[] args) {
        //Δήλωση των μεταβλητών για τις Θερμοκρασίες
        Scanner in = new Scanner(System.in);
        int tempC, tempF;

        //Εντολές
        System.out.println("Πληκτρολογήστε την θερμοκρασία σε βαθμούς Φαρενάιτ");
        tempF = in.nextInt();
        tempC = (tempF - 32) * 5 / 9;

        //Εκτύπωση αποτελέσματος
        System.out.printf("Η θερμοκρασία σε βαθμούς Κελσίου είναι: %d°C", tempC);

    }
}
