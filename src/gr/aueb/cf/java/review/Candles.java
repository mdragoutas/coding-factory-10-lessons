package gr.aueb.cf.java.review;

/**
 * Δίνεται ένας πίνακας με τα ύψη κεριών (π.χ. [3, 2, 3, 1])
 * Μετρήστε πόσα κεριά έχουν το μέγιστο ύψος
 *
 * Για παράδειγμα, είσοδος: [4, 4, 1, 3]
 * Έξοδος: 2 (το μέγιστο ύψος είναι το 4 και υπάρχουν δύο κεριά με αυτό το ύψος)
 */
public class Candles {

    public static void main(String[] args) {

    }

    public static int getTallestCandles(int[] arr) {

        int maxValue = arr[0];
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        for (int el : arr) {
            if (el == maxValue) count++;
        }
        return count;
    }
}
