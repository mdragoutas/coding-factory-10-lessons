package gr.aueb.cf.java.review;

import java.util.Scanner;

/**
 * Θέλουμε να υπολογίσουμε το F(n) όπου F είναι η ακολουθία
 * Fibonacci και n ένας ακέραιος.
 * Το n το δίνει ο χρήστης
 */
public class FibonacciApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Εισάγετε έναν ακέραιο:");
        int n = in.nextInt();

        System.out.printf("Ο αριθμός Fibonacci του %d είναι το: %d", n , getFibonacciValue(n));
    }

    public static int getFibonacciValue(int n) {
        int a = 0;
        int b = 1;
        int fibo = 1;

        if (n == 0) return a;
        if (n == 1) return b;

        for (int i = 2; i <= n; i++) {
            fibo = a + b;
            a = b;
            b = fibo;
        }
        return fibo;
    }

    public static int getFibonacciValue2(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;

        return 0;
    }
}
