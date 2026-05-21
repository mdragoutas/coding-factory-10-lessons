package gr.aueb.cf.java.ch8;

import java.util.Scanner;

public class Arithmetic3App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Εισάγετε 2 ακεραίους:");
        num1 = in.nextInt();
        num2 = in.nextInt();

        if (num2 == 0) {        // state test
            System.out.println("Δεν επιτρέπεται η διαίρεση με το 0");
        } else {
            result = num1 / num2;
            System.out.println("Το αποτέλεσμα είναι: " + result);
        }
    }
}
