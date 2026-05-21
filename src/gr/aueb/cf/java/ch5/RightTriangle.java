package gr.aueb.cf.java.ch5;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει τρεις πλευρές του τριγώνου
 * Ελέγχουμε αν το τρίγωνο με πλευρές a, b και c, όπου a
 * η υποτείνουσα του τριγώνου, είναι ορθογώνιο.
 * Ένα τρίγωνο είναι ορθογώνιο όταν a^2= b^2 + c^2
 */
public class RightTriangle {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        boolean isRight = false;
        final double EPSILON = 0.000005;

        System.out.println("Εισάγετε τις τρεις πλευρές του τριγώνου (ξεκινώντας απο την υποτείνουσα)");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        isRight = Math.abs(a * a - b * b - c * c) < EPSILON;
        System.out.println("Το τρίγωνο είναι ορθογώνιο: " + isRight);
    }
}
