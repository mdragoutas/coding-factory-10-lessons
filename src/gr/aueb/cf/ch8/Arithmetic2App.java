package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 *
 */
public class Arithmetic2App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Εισάγετε 2 ακεραίους:");
        num1 = in.nextInt();
        num2 = in.nextInt();

        try {
            result = num1 / num2;
        } catch (ArithmeticException e) {
            System.err.println("Δεν μπορεί να γίνει διαίρεση με το 0");
            System.err.println(e.getMessage());
            e.printStackTrace();

        }
    }
}