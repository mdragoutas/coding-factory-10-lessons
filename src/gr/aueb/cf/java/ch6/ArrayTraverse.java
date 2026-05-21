package gr.aueb.cf.java.ch6;

/**
 * Traverse an array -> Επίσκεψη σε κάθε στοιχείο του πίνακα
 * και εκτύπωση
 */
public class ArrayTraverse {

    public static void main(String[] args) {
        int[] scores = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Traverse the array using a for loop

        for (int i = 0; i < scores.length ; i++) {
            System.out.println(scores[i]);
        }

        // Enhanced for loop

        for (int score : scores) {
            System.out.println(score);
            System.out.println("*");
        }
    }
}
