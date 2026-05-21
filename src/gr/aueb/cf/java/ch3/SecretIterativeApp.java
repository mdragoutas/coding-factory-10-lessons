package gr.aueb.cf.java.ch3;

import java.util.Scanner;

/**
 * Επαναληπτικά ο χρήστης προσπαθεί να μαντέψει
 * έναν μυστικό ακέραιο
 */
public class SecretIterativeApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int guess = 0;
        final int SECRET = 12;

        System.out.println("Προσπαθήστε να μαντέψετε τον μυστικό ακέραιο");
        guess = in.nextInt();

        while (guess != SECRET){
            System.out.println("Λάθος... Προσπαθήστε ξανά!");
            guess = in.nextInt();
        }
        System.out.println("Συγχαρητήρια! Μαντέψατε σωστά!");
    }
}
