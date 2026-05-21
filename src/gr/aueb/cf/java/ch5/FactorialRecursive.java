package gr.aueb.cf.java.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το n! με αναδρομικό τρόπο
 */
public class FactorialRecursive {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int result = 0;
        int n = 0;

        System.out.println("Enter a positive integer:");
        n = getOneInt(n);

        result = facto(n);

        System.out.printf("The factorial of %d is %d\n", n, result);
    }

    public static int facto(int n) {
        if (n <= 1) return 1;
        return n * facto(n - 1);

    }

    public static int getOneInt(int n) {
        return n = in.nextInt();
    }
}
