package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ορίζει 2 μεθόδους, τις isEven και
 * isOdd για τον έλεγχο ενός ακεραίου αν
 * είναι άρτιος ή περιττός αντίστοιχα
 */
public class OddApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Εισάγετε έναν ακέραιο");
        num = in.nextInt();

    }

    public static boolean  isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
//        return num % 2 != 0 ;
        return !isEven(num);
    }
}
