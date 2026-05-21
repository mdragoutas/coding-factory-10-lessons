package gr.aueb.cf.java.ch8;

import java.util.Scanner;

/**
 * Δημιουργείται ένα {@link ArithmeticException} χωρίς να το
 * χειριστούμε
 */
public class Arithmetic1App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Εισάγετε δύο ακεραίους");
        num1 = in.nextInt();
        num2 = in.nextInt();

        result = num1 / num2;       // αν num2 == 0, τότε δημιουργείται ArithmeticException

        System.out.println("Το αποτέλεσμα είναι: " + result);
    }
}
