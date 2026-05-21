package gr.aueb.cf.java.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει την δύναμη του a^b, όπου a η βάση και b ο εκθέτης,
 * με αναδρομικό τρόπο
 */
public class PowerRecursive {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int result = 0;

        System.out.println("Εισάγετε 2 ακεραίους");

    }

    public static int pow(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * pow(base, exponent - 1);
    }

    public static int getOneInt(int num) {
        return num = in.nextInt();
    }
}
