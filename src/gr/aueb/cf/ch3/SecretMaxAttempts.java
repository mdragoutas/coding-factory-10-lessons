package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Επαναληπτικά μαντεύει ο χρήστης τον μυστικό
 * ακέραιο, αλλά έχει όριο προσπαθειών. Αν ξεπεράσει το όριο χάνει
 */
public class SecretMaxAttempts {
    public static void main(String[] args) {

        final int SECRET_PIN = 1234;
        final int MAX_ATTEMPTS = 3;
        Scanner in = new Scanner(System.in);
        int attempts = 0;
        int inputPin = 0;

        while (true) {
            if (attempts == MAX_ATTEMPTS) {
                System.out.println("Έχετε ξεπεράσει το όριο προσπαθειών, χάσατε! Προσπαθήστε ξανά αργότερα.");
                break;
            }

            System.out.println("Προσπαθήστε να μαντέψετε το μυστικό PIN (4 ψηφία). Προσπάθεια " + (attempts + 1) + " από " + MAX_ATTEMPTS);
            inputPin = in.nextInt();

            if (inputPin != SECRET_PIN) {
                System.out.println("Λάθος PIN. Προσπαθήστε ξανά.");
                attempts++;
                continue;
            }
            System.out.println("Συγχαρητήρια! Μαντέψατε σωστά!");
            break;
        }
    }
}