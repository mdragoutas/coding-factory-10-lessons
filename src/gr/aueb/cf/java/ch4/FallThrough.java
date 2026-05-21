package gr.aueb.cf.java.ch4;

import java.util.Scanner;

/**
 *Fall Through demo of switch / case.
 * Ο χρήστης έναν βαθμό grade και επιστρέφουμε feedback
 * ανάλογα με το εύρος του βαθμού
 */
public class FallThrough {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int grade = 0;
        final int BASE = 5;

        System.out.println("Πληκτρολογήστε έναν βαθμό (1-10)");
        grade = in.nextInt();

        switch(grade) {
            case 1, 2, 3, 4 -> System.out.println("Αποτυχία");
            case BASE, 6 -> System.out.println("Καλώς");
            case 7, 8 -> System.out.println("Λίαν Καλώς");
            case 9,10 -> System.out.println("Άριστα");
            default -> System.out.println("Μη έγκυρος βαθμός. Παρακαλώ δώστε έναν αριθμό μεταξύ του 1 και το 10");
        }
    }
}
