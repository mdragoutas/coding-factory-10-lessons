package gr.aueb.cf.java.ch5;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έκταση με 6 δεκαδικά ψηφία
 * και το πρόγραμμα υπολογίζει και εφμανίζει την έκταση
 * στρογγυλοποιημένη στα 2 δεκαδικά ψηφία
 * Demo of rounding doubles
 */
public class RoundingDoubles {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double area = 0.0;
        double roundedArea = 0;
        double truncatedArea= 0;

        System.out.println("Δώστε την έκταση με 6 δεκαδικά ψηφία");
        area = in.nextDouble();

        roundedArea = Math.round(area * 100.0) / 100.0;

        truncatedArea = (int) (area * 100.0) / 100.0;

    System.out.printf("Έκταση αρχική: %.6f\nΈκταση στρογγυλοποιημένη: %.2f\nΈκταση αποκομμένη: %.2f\n", area, roundedArea, truncatedArea);
    }
}
